using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class AttackTrigger : MonoBehaviour 
{
	public int dmg = 4;
	private int count;

	void OnTriggerEnter(Collider collision)
	{
		count = 0;

		if(collision.isTrigger != true && collision.CompareTag("Enemy"))
		{
			collision.SendMessageUpwards("Damage", dmg);
		}

		YouWin();
	}

	void OnTriggerEnter2D (Collider2D other)
	{
		if(other.gameObject.tag == "Enemy")
		{
			Destroy(other.gameObject);
			count++;
			YouWin();
		}
	}
		
	void YouWin ()
	{
		if(count >= 13)
		{
			Application.LoadLevel("_Scene_WIN");
		}
	}
}
