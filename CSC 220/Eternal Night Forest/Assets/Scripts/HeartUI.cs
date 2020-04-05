using System.Collections;
using System.Collections.Generic;
using UnityEngine;
using System.Linq;														//gets rid of ToList error
using System;															//gets rid if throw error

public class HeartUI : MonoBehaviour 
{
	public PlayerHealthManager _LocalPlayer;
	public List<HeartIcon> _HeartIcons;
	public int _HeartPieces;
	public int _MaxHeartContainer = 20;
	public GameObject _HeartPiecesUI;
	private int _DrawHeartPieces;

	void Start ()
	{
		UpdateHearts();
	}

	// Updates list of heart UI
	void UpdateHearts ()
	{
		_HeartIcons = GetComponentsInChildren<HeartIcon>().ToList();	//makes losing hearts go in order and allows expansion
		_LocalPlayer = FindObjectOfType<PlayerHealthManager>();
		_LocalPlayer._MaxHealth = _HeartIcons.Count * 4;
		_LocalPlayer._CurrentHealth = _LocalPlayer._MaxHealth;
	}

	public void Update ()
	{
		DrawHearts();
	}

	// Does the damage for hearts
	private void DrawHearts ()
	{
		for(int i = 1; i < _HeartIcons.Count + 1; i++)					//it's i = 1 so the _HeartIcons doesn't multiply 0 * 4
		{
			_DrawHeartPieces = _LocalPlayer._CurrentHealth % 4;

			if (_LocalPlayer._CurrentHealth >= i * 4) {
				_HeartIcons [i - 1].SendAnimValue (4);
			} 
			else 
			{
				if ((_LocalPlayer._CurrentHealth - (i - 1) * 4) <= 0) {
					_HeartIcons [i - 1].SendAnimValue (0);
				} 
				else 
				{
					_HeartIcons [i - 1].SendAnimValue (_DrawHeartPieces);
				}
			}
		}
	}

	public void AddHeartPieces (int _HeartPiecesValue)
	{
		//throw new NotImplementedException();
		if (_HeartIcons.Count >= _MaxHeartContainer)
		{
			return;
		}

		_HeartPieces += _DrawHeartPieces;

		if (_HeartPieces - 4 >= 0)
		{
			GameObject _TempObject = Instantiate(_HeartPiecesUI, Vector2.zero, Quaternion.identity) as GameObject;
			_TempObject.transform.SetParent(this.transform);
			_HeartPieces -= 4;

			UpdateHearts();
		}
	}
}
