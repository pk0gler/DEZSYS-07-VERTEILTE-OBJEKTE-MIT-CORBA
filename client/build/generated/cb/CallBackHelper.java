package cb;


/**
 * Generated from IDL interface "CallBack".
 *
 * @author JacORB IDL compiler V 3.7
 * @version generated at Mar 30, 2016 1:27:44 PM
 */

public abstract class CallBackHelper
{
	private volatile static org.omg.CORBA.TypeCode _type;
	public static org.omg.CORBA.TypeCode type ()
	{
		if (_type == null)
		{
			synchronized(CallBackHelper.class)
			{
				if (_type == null)
				{
					_type = org.omg.CORBA.ORB.init().create_interface_tc("IDL:cb/CallBack:1.0", "CallBack");
				}
			}
		}
		return _type;
	}

	public static void insert (final org.omg.CORBA.Any any, final cb.CallBack s)
	{
			any.insert_Object(s);
	}
	public static cb.CallBack extract(final org.omg.CORBA.Any any)
	{
		return narrow(any.extract_Object()) ;
	}
	public static String id()
	{
		return "IDL:cb/CallBack:1.0";
	}
	public static CallBack read(final org.omg.CORBA.portable.InputStream in)
	{
		return narrow(in.read_Object(cb._CallBackStub.class));
	}
	public static void write(final org.omg.CORBA.portable.OutputStream _out, final cb.CallBack s)
	{
		_out.write_Object(s);
	}
	public static cb.CallBack narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof cb.CallBack)
		{
			return (cb.CallBack)obj;
		}
		else if (obj._is_a("IDL:cb/CallBack:1.0"))
		{
			cb._CallBackStub stub;
			stub = new cb._CallBackStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
		else
		{
			throw new org.omg.CORBA.BAD_PARAM("Narrow failed");
		}
	}
	public static cb.CallBack unchecked_narrow(final org.omg.CORBA.Object obj)
	{
		if (obj == null)
		{
			return null;
		}
		else if (obj instanceof cb.CallBack)
		{
			return (cb.CallBack)obj;
		}
		else
		{
			cb._CallBackStub stub;
			stub = new cb._CallBackStub();
			stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
			return stub;
		}
	}
}
