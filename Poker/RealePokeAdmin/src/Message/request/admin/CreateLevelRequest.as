package Message.request.admin
{
	import Message.SFSCustomRequest;
	
	import com.smartfoxserver.v2.requests.BaseRequest;

	public class CreateLevelRequest extends SFSCustomRequest
	{
		public function CreateLevelRequest()
		{	
			super(ADMIN_REQUEST_NAME.CREATE_LEVEL_REQ);
		}
		
		override public function AddParam(key:String, value:*):SFSCustomRequest
		{
			return super.AddParam(key, value);
		}
		
		override public function SetName(name:String):SFSCustomRequest
		{
			m_name = name;
			return this;
		}
		
		override public function ToSFSRequest():BaseRequest
		{
			return super.ToSFSRequest();
		}
	}
}