using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using UnityEngine.UI;

public class UIManager : MonoBehaviour {

	public Slider _HealthBar;
	public Text _HPText;
	public PlayerHealthManager _PlayerHealth;

	void Start () 
	{
		
	}

	void Update () 
	{
		_HealthBar.maxValue = _PlayerHealth._MaxHealth;
		_HealthBar.value = _PlayerHealth._CurrentHealth;
		_HPText.text = "HP: "+ _PlayerHealth._CurrentHealth + "/" + _PlayerHealth._MaxHealth;
	}
}
