using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[RequireComponent(typeof(BoxCollider2D))]
public class HeartPieces : MonoBehaviour 
{
	public int _HeartPiecesValue;

	public HeartUI _HeartUI;							//uses the HeartUI script and has a place in this script

	void Start () 
	{
		GetComponent<BoxCollider2D>().isTrigger = true;
		_HeartUI = FindObjectOfType<HeartUI>();			//finds game object with HeartUI script attached to it
	}

	public void OnTriggerEnter2D (Collider2D collision)
	{
		if(collision.tag == "Player")
		{
			_HeartUI.AddHeartPieces(_HeartPiecesValue);
			Destroy(gameObject);
		}
	}
}
