using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class CameraController : MonoBehaviour {

	public GameObject _FollowTarget;
	private Vector3 _TargetPos;

	void Start () 
	{
		_TargetPos = transform.position - _FollowTarget.transform.position;
	}

	void LateUpdate () 
	{
		transform.position = _FollowTarget.transform.position + _TargetPos;
	}
}
