using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class SwordAnimation : MonoBehaviour 
{
	public Animator _Anim;
	public bool _IsAttacking;

	// Use this for initialization
	void Start () 
	{
		_IsAttacking = false;
	}
	
	// Update is called once per frame
	void Update () 
	{
		if (_IsAttacking == true) {
			_Anim.SetBool ("IsAttacking", true);
		} 

		else 
		{
			_Anim.SetBool("IsAttacking", false);
		}
	}
}
