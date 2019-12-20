package com.techelevator;

public class ReserveAuction extends Auction {
	
	private int reservePrice;
	
	public ReserveAuction(String item, int reservePrice) {
		super(item);
		this.reservePrice = reservePrice;
		
	}
	
	/* This class overrides the default behavior of accepting all bids. If the offered
	 * bid is less than the reserve, ignore it.
	 */
	@Override
	public boolean placeBid(Bid offeredBid) {
		boolean isCurrentWinningBid = false;
		
		if (offeredBid.getBidAmount() >= reservePrice) {
			isCurrentWinningBid = super.placeBid(offeredBid);
		}
			
		
		return isCurrentWinningBid;
	}

}
