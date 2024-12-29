package demo_06;
//うるう年の判断ロジック( Junitを使用してテストコードを作成 )

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import testCode.LeapYear;

class JunitTest 
{  // どのソースをテストするか定義しローカル変数( leapYear )も定義する。
	private static LeapYear leapYear;   
	
	@BeforeAll  //全テストの開始前に1度だけ実行、終了後は「 @afterAll 」を実行しれ終了する
	static void beforeAll() {
		leapYear = new LeapYear();  // 初期処理としてインスタンスを生成
	}
	
	@Test
	void test1() {
		// 400の倍数 : 期待値 : True
		boolean actual = leapYear.isLeapYear( 2000 );  // 引数が2000の場合
		boolean expected = true;
		assertEquals( expected, actual );  // 期待値( expected )・実際値( actual )を比較
	}

	@Test
	void test2() {
		// 100の倍数 : 期待値 : False
		boolean actual = leapYear.isLeapYear( 1900 );
		boolean expected = false;
		assertEquals( expected, actual );
	}

	@Test
	void test3() {
		// 4の倍数 : 期待値 : True
		boolean actual = leapYear.isLeapYear( 1904 );
		boolean expected = true;
		assertEquals( expected, actual );
	}

	@Test
	void test4() {
		// その他 : 期待値 : False
		boolean actual = leapYear.isLeapYear( 2010 );
		boolean expected = false;
		assertEquals( expected, actual );
	}

	@Test   //	@Disabled はテストの無効化。クラス名、メソッド名にも使用可能
	void test5() {
		// その他 : 期待値 : False
		boolean actual = leapYear.isLeapYear( -1000 );
		boolean expected = true;  // ワザと true  
		assertEquals( expected, actual );
	}	
}
