package Assignment_2;

public class _1_SingletonClass {

	String name;

	private static _1_SingletonClass s;

	private _1_SingletonClass() {

	name = "hello" ;

	}

	static _1_SingletonClass getInstance() {

	if (s == null)

	s = new _1_SingletonClass();

	return s;

	}

}