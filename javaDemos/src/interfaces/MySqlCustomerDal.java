package interfaces;

public class MySqlCustomerDal implements ICustomerDal, IRepository {

	@Override
	public void add() {
		System.out.println("My Sql eklendi");
		
	}

	@Override
	public void remove() {
		// TODO Auto-generated method stub
		
	}

}
