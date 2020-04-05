import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Cycle
{
    int vertex;
    LinkedList<Integer>[] adjList;

    public Cycle(int vertex)
    {
        this.vertex = vertex;
        adjList = new LinkedList[vertex];

        for (int i = 0; i < vertex; i++)
        {
            adjList[i] = new LinkedList<>();
        }
    }

    public static void main(String[] args)
    {
        /*** O(V + E) ***/
        int verticies = 4;
        Cycle cycle = new Cycle(verticies);
        boolean result = cycle.isCycle();

        cycle.addEdge(0, 1);
        cycle.addEdge(1, 2);
        cycle.addEdge(2, 3);
        cycle.addEdge(3, 1);

        System.out.println("Cycle:  " + result);
    }

    /*** Adds an edge to any given directed graph
     *  src = where point comes from
     *  dst = where point goes to
     ***/
    public void addEdge(int src, int dst)
    {
        adjList[src].addFirst(dst);
    }

    /*** Uses DFS to see if any given directed cycle has a graph ***/
    public boolean isCycle()
    {
        boolean[] visited = new boolean[vertex];
        boolean[] recStack = new boolean[vertex];

        /** does DFS for each node **/
        for (int i = 0; i < vertex; i++)
        {
            if (isCycleUtil(i, visited, recStack))
            {
                return true;
            }
        }

        return false;
    }

    /*** Checks path validity and if any given vertex has been visited ***/
    public boolean isCycleUtil(int vertices, boolean[] visited, boolean[] recStack)
    {
        /** recursive stack to adjacent vertices **/
        for (int i = 0; i < adjList[vertices].size(); i++)
        {
            int adjVertex = adjList[vertices].get(i);

            if (!visited[adjVertex] && isCycleUtil(adjVertex, visited, recStack))
            {
                return true;
            } else if (recStack[adjVertex])
            {
                return true;
            }
        }

        /** if this has been reached, no cycle has been found **/
        recStack[vertices] = false;

        return false;
    }
}
