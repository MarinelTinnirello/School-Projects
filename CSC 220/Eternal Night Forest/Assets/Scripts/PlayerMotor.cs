/************************************
Thanks to 8BitsPerByte, Siwlerdaoz, and gamesplusjames for the tutorial vidoes to help me make the scripts
Also, all credits go to Nintendo for the Octorok sprites from Minish Cap
************************************/

using System.Collections;
using System.Collections.Generic;
using UnityEngine;

[RequireComponent(typeof(Rigidbody2D))]
[RequireComponent(typeof(Animator))]
[RequireComponent(typeof(BoxCollider2D))]

public class PlayerMotor : MonoBehaviour 
	{

	public float _Speed = 2;

	[SerializeField]
	private Vector2 _DeltaForce;			// passes into Calc Move
	private Vector2 _LastDirection;

	private Rigidbody2D _RGB;
	private Animator _Anim;
	private BoxCollider2D _BoxCollider;

	private bool _IsMoving;

	/*private bool _Attack;
	public float _AttackTime;				// we want to give it a number
	private float _AttackTimeCounter;		// will be equal to above */

	void Awake() 
	{
		_Anim = GetComponent<Animator>();
		_RGB = GetComponent<Rigidbody2D>();
		_BoxCollider = GetComponent<BoxCollider2D>();
	}

	// Use this for initialization
	void Start () 
	{
		_RGB.gravityScale = 0;
		_RGB.constraints = RigidbodyConstraints2D.FreezeRotation;
	}
	
	// Update is called once per frame
	void Update () 
	{
		CheckInput();
		//Attack();
		//ResetValues();
	}

	// Reads player's input
	void CheckInput ()
	{
		_IsMoving = false;

		var _H = Input.GetAxisRaw("Horizontal");		// gets the horizontal directions from -1 to 1
		var _V = Input.GetAxisRaw("Vertical");			// gets the vertical directions from -1 to 1

		//if (!_Attack) 
		//{
			if (_H < 0 || _H > 0 || _V < 0 || _V > 0) 
			{
				_IsMoving = true;
				
				_LastDirection = _RGB.velocity;
			}

			/*if (Input.GetKeyDown (KeyCode.J)) 			// makes it so the player has to keep pressing the attack button ("j")
			{ 			
				_AttackTimeCounter = _AttackTime;
				_Attack = true;

				_RGB.velocity = Vector2.zero;
				_Anim.SetBool("IsAttacking", true);
			}*/
		//}

		/*if(_AttackTimeCounter > 0)						// ticks attack time until 0, when player can move again
		{
			_AttackTimeCounter -= Time.deltaTime;
		}

		if(_AttackTimeCounter <= 0)
		{
			_Attack = false;
			_Anim.SetBool("IsAttacking", false);
		}*/
		
		_DeltaForce = new Vector2(_H, _V);

		CalculateMovement(_DeltaForce * _Speed);

		//HandleAttack();
	}

	/*void Attack() 
	{
		if(_Attack) 
		{
			_Anim.SetTrigger("IsAttacking");
		}
	}

	void HandleAttack ()
	{
		if(Input.GetKeyDown(KeyCode.J)) 			// makes it so the player has to keep pressing the attack button ("j")
		{ 			
			_Attack = true;
		}
	}*/

	// Adds force to a player
	void CalculateMovement (Vector2 _PlayerForce)
	{
		_RGB.velocity = Vector2.zero;
		_RGB.AddForce(_PlayerForce, ForceMode2D.Impulse);		// adds force over time

		SendAnimInfo();
	}

	// sends info from the animator
	void SendAnimInfo ()
	{
		_Anim.SetFloat("XSpeed", _RGB.velocity.x);
		_Anim.SetFloat("YSpeed", _RGB.velocity.y);

		_Anim.SetFloat("LastX", _LastDirection.x);
		_Anim.SetFloat("LastY", _LastDirection.y);

		_Anim.SetBool("IsMoving", _IsMoving);
	}
}
