package com.jock.calculator.test;

import android.test.ActivityInstrumentationTestCase2;
import android.widget.Button;
import android.widget.EditText;

import com.jock.calculator.MainActivity;

public class SimpleMissingOpTest extends ActivityInstrumentationTestCase2<MainActivity>
{

	private MainActivity mActivity;

	private Button btn_1;
	private Button btn_2;
	private Button btn_3;
	private Button btn_4;
	private Button btn_5;
	private Button btn_6;
	private Button btn_7;
	private Button btn_8;
	private Button btn_9;
	private Button btn_plus;
	private Button btn_minus;
	private Button btn_mult;
	private Button btn_equals;
	private Button btn_divide;
	private Button btn_leftB;
	private Button btn_rightB;
	private Button btn_clr;
	private EditText cal_et;


	public SimpleMissingOpTest()
	{
		super( "com.jock.calculator", MainActivity.class );
	}


	@Override
	protected void setUp() throws Exception
	{
		super.setUp();

		setActivityInitialTouchMode( false );

		mActivity = getActivity();

		btn_1 = (Button) mActivity.findViewById( com.jock.calculator.R.id.one_btn );
		btn_2 = (Button) mActivity.findViewById( com.jock.calculator.R.id.two_btn );
		btn_3 = (Button) mActivity.findViewById( com.jock.calculator.R.id.three_btn );
		btn_4 = (Button) mActivity.findViewById( com.jock.calculator.R.id.four_btn );
		btn_5 = (Button) mActivity.findViewById( com.jock.calculator.R.id.five_btn );
		btn_6 = (Button) mActivity.findViewById( com.jock.calculator.R.id.six_btn );
		btn_7 = (Button) mActivity.findViewById( com.jock.calculator.R.id.seven_btn );
		btn_8 = (Button) mActivity.findViewById( com.jock.calculator.R.id.eight_btn );
		btn_9 = (Button) mActivity.findViewById( com.jock.calculator.R.id.nine_btn );
		btn_plus = (Button) mActivity.findViewById( com.jock.calculator.R.id.plus_btn );
		btn_minus = (Button) mActivity.findViewById( com.jock.calculator.R.id.minus_btn );
		btn_mult = (Button) mActivity.findViewById( com.jock.calculator.R.id.mult_btn );
		btn_divide = (Button) mActivity.findViewById( com.jock.calculator.R.id.divide_btn );
		btn_equals = (Button) mActivity.findViewById( com.jock.calculator.R.id.equals_btn );
		btn_leftB = (Button) mActivity.findViewById( com.jock.calculator.R.id.leftBracket_btn );
		btn_rightB = (Button) mActivity.findViewById( com.jock.calculator.R.id.rightBracket_btn );
		btn_clr = (Button) mActivity.findViewById( com.jock.calculator.R.id.clr_btn );
		cal_et = (EditText) mActivity.findViewById( com.jock.calculator.R.id.editText );

	}


	public void testCalUI()
	{
		// 5+
		mActivity.runOnUiThread( new Runnable()
		{
			public void run()
			{
				btn_5.performClick();
				btn_plus.performClick();
				btn_equals.performClick();

			}
		} );

		try
		{
			Thread.sleep( 1000 );
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		assertTrue( cal_et.getText().toString().trim().equals( "5" ) );

		// +5
		mActivity.runOnUiThread( new Runnable()
		{
			public void run()
			{
				btn_clr.performClick();
				btn_plus.performClick();
				btn_5.performClick();
				btn_equals.performClick();

			}
		} );

		try
		{
			Thread.sleep( 1000 );
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		assertTrue( cal_et.getText().toString().trim().equals( "5" ) );

		// 5-
		mActivity.runOnUiThread( new Runnable()
		{
			public void run()
			{

				btn_clr.performClick();
				btn_5.performClick();
				btn_minus.performClick();
				btn_equals.performClick();

			}
		} );

		try
		{
			Thread.sleep( 1000 );
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		assertTrue( cal_et.getText().toString().trim().equals( "5" ) );

		// -5
		mActivity.runOnUiThread( new Runnable()
		{
			public void run()
			{
				btn_clr.performClick();
				btn_minus.performClick();
				btn_5.performClick();
				btn_equals.performClick();

			}
		} );

		try
		{
			Thread.sleep( 1000 );
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		assertTrue( cal_et.getText().toString().trim().equals( "-5" ) );

		// 5/
		mActivity.runOnUiThread( new Runnable()
		{
			public void run()
			{
				btn_clr.performClick();
				btn_5.performClick();
				btn_divide.performClick();
				btn_equals.performClick();
				
			}
		} );
		
		try
		{
			Thread.sleep( 1000 );
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		assertTrue( cal_et.getText().toString().trim().equals( "5" ) );

		// /5
		mActivity.runOnUiThread( new Runnable()
		{
			public void run()
			{
				btn_clr.performClick();
				btn_divide.performClick();
				btn_5.performClick();
				btn_equals.performClick();
				
			}
		} );
		
		try
		{
			Thread.sleep( 1000 );
		}
		catch (InterruptedException e)
		{
			e.printStackTrace();
		}
		assertTrue( cal_et.getText().toString().trim().equals( "0" ) );

	}
}
