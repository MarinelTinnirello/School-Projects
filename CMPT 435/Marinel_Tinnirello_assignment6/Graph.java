import java.util.*;

public class Graph {
    private Vertex vertexList[];
    private int vertexcycleflag[];
    private int adjMat[][];
    private LinkedList<LinkedList<Integer>> adjlist;
    private int nVerts;
    private Stack<Integer> theStack; //for DFS
    private Queue theQueue; //for BFS

    public static void main(String[] args) {
        // complete the main method to create a graph for problem 5 in Assignment 5
        // test if the graph contains cycles
		/* An example to create a graph using the Graph class
		char[] element = {'A','B','C','D','E'};
		Graph theGraph = new Graph(element.length);
		 for(char s :element){
		   theGraph.addVertex(s);
		  }
		// A: 0, B: 1, C: 2, D: 3, E: 4
		theGraph.addEdge(0, 1);
		theGraph.addEdge(1, 2);
		theGraph.addEdge(0, 3);
		theGraph.addEdge(3, 4);

		System.out.print("visits:");
		// theGraph.dfs();
		// theGraph.bfs();
		theGraph.dfsr();
		System.out.println();
		*/

        char[] element = {'0','1','2','3','4','5'};
        Graph theGraph = new Graph(element.length);
        Graph cycles = new Graph(element.length);



        for(char s : element)
        {
            theGraph.addVertex(s);
        }

        // problem 3's #s
        theGraph.addEdge(0, 1);
        theGraph.addEdge(0, 2);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(1, 3);
        theGraph.addEdge(2, 3);
        theGraph.addEdge(3, 4);
        theGraph.addEdge(4, 1);
        theGraph.addEdge(4, 5);

        // test cycles
        /*theGraph.addEdge(0, 1);
        theGraph.addEdge(1, 2);
        theGraph.addEdge(2, 3);
        theGraph.addEdge(0, 3);*/

        System.out.println("Visits:     ");
        theGraph.dfs();
        System.out.println("\nCycles:     " + cycles.detectcycle());
    }

    public Graph(int n) {
        vertexList = new Vertex[n];
        vertexcycleflag = new int[n];

        //cycleflag
        for  (int i = 0; i < n; i++) {
            vertexcycleflag[i]=-1;
        }

        //adj matrix
        adjMat = new int[n][n];
        nVerts = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                adjMat[i][j] = 0;
            }
        }

        //adj list

        adjlist = new LinkedList<LinkedList<Integer>>();
        for (int i = 0; i < n; i++) {

            adjlist.add(new LinkedList<Integer>());
        }

        theStack = new Stack<Integer>();
        theQueue = new Queue();
    }

    // add vertex
    public void addVertex(char nodename)
    {
        vertexList[nVerts++] = new Vertex(nodename);
    }

    // undirected
    public void addEdge(int start, int end)
    {
        //adj matrix
        adjMat[start][end] = 1;
        //adjMat[end][start] = 1;                   // for directed graph
        //adj list

        if(!adjlist.get(start).contains(end))
            adjlist.get(start).add(end);

        /*if(!adjlist.get(end).contains(start))
            adjlist.get(end).add(start);*/          // for directed graph
    }

    // print vertex label
    public void displayVertex(int v)
    {
        System.out.print(vertexList[v].lable);
    }

    // get an unvisited connected vertex
    public int getAdjUnvisitedVertex(int v) {
        for (int i = 0; i < nVerts; i++) {
            if (adjMat[v][i] == 1 && vertexList[i].wasVisited == false)
            {
                return i;
            }
        }

        return -1;
    }

    public boolean detectcycle()
    {
        // complete the method to detect cycles in the graph
        // feel free to change the return type, parameters

        int in_degree[] = new int[adjMat.length];               // in-degree to be found

        /** fills in_degree with 0s **/
        for (int i = 0; i < in_degree.length; i++)
        {
            in_degree[i] = 0;
        }

        /** gets in_degree for each node **/
        for (int i = 0; i < in_degree.length; i++)
        {
            Iterator iterator = adjlist.get(i).iterator();      // to iterate through the list

            while (iterator.hasNext())                          // adds 1 to each node
            {
                in_degree[(int)iterator.next()]++;
            }
        }

        int in_degree_length = in_degree.length;                // I solely have this for the loop below

        /** checks for cycles
         * if there's less than 3 nodes, then there can't be any cycles
         **/
        while (in_degree_length > 2)
        {
            int indexTracker = -1;

            /** goes through array **/
            for (int i = 0; i < in_degree.length; i++)
            {
                /* if there's an in_degree with a 0 marker
                * decrement # of nodes left
                * set the indexTracker to the index
                * exit
                */
                if (in_degree[i] == 0)
                {
                    in_degree_length--;
                    indexTracker = i;
                    i = in_degree.length;
                }
            }

            /* if indexTracker wasn't set, then all modes have 0 or mode connecting nodes
            * else remove the nodes and all associated edges
            */
            if (indexTracker == -1)
            {
                return true;
            } else
            {
                in_degree[indexTracker] = -1;

                /** goes through the adjMat **/
                for (int j = 0; j < adjMat[indexTracker].length; j++)
                {
                    /* if the indexTracker and index are marked with 1
                    * decrement the # of in-degrees
                    */
                    if (adjMat[indexTracker][j] == 1)
                    {
                        in_degree[j]--;
                    }
                }
            }
        }

        return false;           // there's less than 3 nodes
    }

    // DFS using stack
    public void dfs()
    {
        for (int i = 0; i < nVerts; i++) {
            vertexList[i].wasVisited = false;// Reset the wasvisited matrix
        }
        //Pick the starting node randomly
        Random rand = new Random();
        int randNum = rand.nextInt(nVerts);

        //Visit the starting node
        vertexList[randNum].wasVisited = true;
        displayVertex(randNum);
        theStack.push(randNum);

        while (!theStack.isEmpty()) {
            int neighbor = getAdjUnvisitedVertex(theStack.peek());
            if (neighbor == -1) {
                theStack.pop();
            } else {
                vertexList[neighbor].wasVisited = true;
                displayVertex(neighbor);
                theStack.push(neighbor);
            }
        }
    }

    // BFS using a queue
    public void bfs()
    {
        for (int j = 0; j < nVerts; j++) {
            vertexList[j].wasVisited = false; // Reset the wasvisited matrix
        }
        //Pick the starting node randomly
        Random rand = new Random();
        int randNum = rand.nextInt(nVerts);

        //Visit the starting node
        vertexList[randNum].wasVisited = true;
        displayVertex(randNum);
        theQueue.insert(randNum);

        while (!theQueue.isEmpty()) {
            int currentv = theQueue.remove();
            int neighbor;
            while ((neighbor = getAdjUnvisitedVertex(currentv)) != -1) {
                vertexList[neighbor].wasVisited = true;
                displayVertex(neighbor);
                theQueue.insert(neighbor);
            }
        }
    }
}






