using System.Collections;
using System.Collections.Generic;
using UnityEngine;

public class Attack : MonoBehaviour {

	private bool _Attack = false;
	public float _AttackTime = 0;				// we want to give it a number
	private float _AttackCooldown = 0.3f;		// gives it a moment before attacking again
	public Collider2D _AttackTrigger;
	private Animator _Anim;

	void Awake ()
	{
		_Anim = gameObject.GetComponent<Animator>();
		_AttackTrigger.enabled = false;
	}

	void Update ()
	{
		if (Input.GetKeyDown ("f") && !_Attack) 
		{
			_Attack = true;
			_AttackTime = _AttackCooldown;
			_AttackTrigger.enabled = true;
		}

		if(_Attack)
		{
			if (_AttackTime > 0) {
				_AttackTime -= Time.deltaTime;
			} 
			else 
			{
				_Attack = false;
				_AttackTrigger.enabled = false;
			}
		}

		_Anim.SetBool("IsAttacking", _Attack);
	}


}
