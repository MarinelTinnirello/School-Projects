using System.Collections;
using System.Collections.Generic;
using UnityEngine;

//RequireComponent(typeof(Rigidbody2D))]
//[RequireComponent(typeof(BoxCollider2D))]
public class PlayerHealthManager : MonoBehaviour 
{
	public int _CurrentHealth;			//for current health
	public int _MaxHealth;				//for max health

	/*[ExecuteInEditMode]
	void onValidate () 
	{
		_CurrentHealth = Mathf.Clamp(_CurrentHealth, 0, _MaxHealth);		//sets bounds for health

	}*/

	void Start ()
	{
		_CurrentHealth = _MaxHealth;
	}

	void Update ()
	{
		if(_CurrentHealth <= 0)
		{
			gameObject.SetActive(false);
		}
	}

	public void Damage (int dmg)								// this can be accessed by other scripts because it is public
	{
		_CurrentHealth -= dmg;
	}

	public void SetMaxHealth ()
	{
		_MaxHealth = _CurrentHealth;
	}
}
