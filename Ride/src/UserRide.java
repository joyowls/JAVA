
public class UserRide implements IRide, IUser {

	private IRide ride;
	private IUser user;

	public void setRide(IRide ride) {
		this.ride = ride;
	}

	public void setUser(IUser user) {
		this.user = user;
	}

	@Override
	public void Ticket(int num1) {
		// TODO Auto-generated method stub
		user.Ticket(num1);
	}

	@Override
	public void TicketPrint() {
		// TODO Auto-generated method stub
		user.TicketPrint();
	}

	@Override
	public void information(int num1, int num2) {
		// TODO Auto-generated method stub
		ride.information(num1, num2);
	}

	@Override
	public void rideList() {
		// TODO Auto-generated method stub
		ride.rideList();
	}

}
