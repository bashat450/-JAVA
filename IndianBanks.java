package Bank;
// Second Interface
class IndianBanks implements  InternationalBank {
	public void msg_Info() {
		System.out.println("Indian Bank Implements International Banks...");
	}
	public static void main(String args[]) {
		IndianBanks b = new IndianBanks();
		b.msg_Info();
	}

}
