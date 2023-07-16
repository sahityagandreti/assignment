
public class CurrentAcc extends Account{
	
	double overDraftLimit;
	public CurrentAcc() {}
	public CurrentAcc(double overDraftLimit) {
		
		this.overDraftLimit = validateoverDraftLimit( overDraftLimit);
	}
	private double validateoverDraftLimit(double overDraftLimit) {
		if(overDraftLimit>90000) {
			return overDraftLimit;
			
		}
		throw new RuntimeException("limit reached");
	}
	public double getOverDraftLimit() {
		return overDraftLimit;
	}
	public void setOverDraftLimit(double overDraftLimit) {
		this.overDraftLimit = overDraftLimit;
	}
	
	
	

}
