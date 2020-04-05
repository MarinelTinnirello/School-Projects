using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class HurtCharacter : MonoBehaviour {

	public int dmg;

	void Start () 
	{
		
	}

	void Update ()
	{
		
	}

	void OnCollisonEnter2D (Collision2D other)
	{
		if(other.gameObject.name == "Player")
		{
			other.gameObject.GetComponent<PlayerHealthManager>().Damage(4);
		}
	}
}
