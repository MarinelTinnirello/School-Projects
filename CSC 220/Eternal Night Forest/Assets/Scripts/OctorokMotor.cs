using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class OctorokMotor : MonoBehaviour 
{
	public float _moveSpeed;
	private Rigidbody2D _RGB;
	private bool _IsMoving;
	public float _TimeBetweenMove;
	private float _TimeBetweenMoveCounter;
	public float _TimeToMove;
	private float _TimeToMoveCounter;
	private Vector3 _MoveDirection;

	public float _WaitToReload;		// level reload
	private bool _Reloading;		// knows if player has to reload or not
	private GameObject _Player;

	// Use this for initialization
	void Start () 			// sets up enemies movement
	{
		_RGB = GetComponent<Rigidbody2D>();

		//_TimeBetweenMoveCounter = _TimeBetweenMove;
		//_TimeToMoveCounter = _TimeToMove;

		_TimeBetweenMoveCounter = Random.Range(_TimeBetweenMove * 0.75f, _TimeBetweenMove * 1.25f);
		_TimeToMoveCounter = Random.Range(_TimeToMove * 0.75f, _TimeToMove * 1.25f);
	}
	
	// Update is called once per frame
	void Update () 			// makes enemies movement random
	{
		if(_IsMoving)
		{
			_TimeToMoveCounter -= Time.deltaTime;
			_RGB.velocity = _MoveDirection;

			if(_TimeToMoveCounter < 0f)
			{
				_IsMoving = false;
				//_TimeBetweenMoveCounter = _TimeBetweenMove;
				_TimeBetweenMoveCounter = Random.Range(_TimeBetweenMove * 0.75f, _TimeBetweenMove * 1.25f);
			}
		}

		else
		{
			_TimeBetweenMoveCounter -= Time.deltaTime;
			_RGB.velocity = Vector2.zero;

			if(_TimeBetweenMoveCounter < 0f)
			{
				_IsMoving = true;
				//_TimeToMoveCounter = _TimeToMove;
				_TimeToMoveCounter = Random.Range(_TimeToMove * 0.75f, _TimeToMove * 1.25f);

				_MoveDirection = new Vector3(Random.Range(-1f, 1f), Random.Range(-1f, 1f) * _moveSpeed, 0f);
			}
		}

		/*if(_Reloading)
		{
			_WaitToReload -= Time.deltaTime;

			if(_WaitToReload < 0)
			{
				Application.LoadLevel(Application.loadedLevel);
				_Player.SetActive(true);
			}
		}*/
	}

	void OnCollisionEnter2D (Collision2D other)
	{
		if(other.gameObject.name == "Player")
		{
			//Destroy (other.gameObject);
			/*other.gameObject.SetActive(false);
			_Reloading = true;
			_Player = other.gameObject;*/

			Application.LoadLevel("_Scene_GAMEOVER");
		}
	}
}
