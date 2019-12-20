package com.techelevator;

public class BuyoutAuction extends Auction{
	
	private int buyoutPrice; 
	
	public BuyoutAuction(String itemForSale, int buyoutPrice) {
		super(itemForSale);
		this.buyoutPrice = buyoutPrice; 		
	}
	
	public int getBuyoutPrice() {
		return buyoutPrice;
	}
	
	//has the buyoutPrice been met?
	@Override
	public boolean isAuctionOver() {
		return (getHighBid().getBidAmount()>=buyoutPrice);			
			
	}
	
	/* Overriding the pace bid behavior. If the offered bid meets or exceeds the buyoutprice, the bid is set
	 * to the buyout price and all future bids are ignored.
	 */
	@Override
	public boolean placeBid(Bid offeredBid) {

		boolean isCurrentWinningBid = false;
 
		if (getHighBid().getBidAmount() < buyoutPrice) { //if we don't have a previos winner
			if (offeredBid.getBidAmount() >=buyoutPrice) {
				offeredBid = new Bid(offeredBid.getBidder(),buyoutPrice);
			}
			isCurrentWinningBid = super.placeBid(offeredBid);
			
		}
		//else future bids are ignored so just go ahead and return false
		
		return isCurrentWinningBid;
	}

}
