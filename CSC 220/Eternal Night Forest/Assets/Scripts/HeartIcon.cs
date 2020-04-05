using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[RequireComponent(typeof(Animator))]
public class HeartIcon : MonoBehaviour 
{
	public Animator _Anim;

	public void Awake()
	{
		_Anim = GetComponent<Animator>();
	}

	public void SendAnimValue (int _HeartValue) 			//passed from _Anim
	{
		_Anim.SetInteger("HeartValue", _HeartValue);
	}
}
