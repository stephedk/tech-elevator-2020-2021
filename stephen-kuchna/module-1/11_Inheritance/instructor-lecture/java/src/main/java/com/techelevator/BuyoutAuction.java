package com.techelevator;

public class BuyoutAuction extends Auction
{

	private int buyOutPrice;
	private boolean noNewBids;
	
	public BuyoutAuction(String itemForSale, int buyOutPrice)
	{
		// you MUST call the super constructor
		// BEFORE you can do anything else
		// pass it the arguments that it needs
		super(itemForSale);
		
		this.buyOutPrice = buyOutPrice;
		noNewBids = false;
	}

	public int getBuyOutPrice()
	{
		return buyOutPrice;
	}
	
	// new code
	public void buyNow(Bid bid) 
	{
		if(bid.getBidAmount() >= buyOutPrice)
		{
			boolean isHighBid = placeBid(bid);
			noNewBids = isHighBid;
			// end the auction
		}
	}
	
	@Override
	public boolean placeBid(Bid offeredBid)
	{
		// allow bids
		if(!noNewBids)
		{
			return super.placeBid(offeredBid);
		}
		
		return false;
	}

}
