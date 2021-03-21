package com.techelevator;

import java.math.BigDecimal;

public class Application {

    public static void main(String[] args) {

        // Create a new general auction
        System.out.println("Starting a general auction");
        System.out.println("-----------------");

        Auction generalAuction = new Auction("Tech Elevator t-shirt");

        generalAuction.placeBid(new Bid("Josh", 1));
        generalAuction.placeBid(new Bid("Fonz", 23));
        generalAuction.placeBid(new Bid("Rick Astley", 13));
        
        Bid winnigBid = generalAuction.getHighBid();
        System.out.println(winnigBid.getBidder() + " wins the " + generalAuction.getItemForSale());
        System.out.println("For $" + winnigBid.getBidAmount());
        //....
        //....
        // This might go on until the auction runs out of time or hits a max # of bids
        
        
        System.out.println();
        System.out.println();

        System.out.println("Starting a buyout auction");
        System.out.println("-----------------");
        
        BuyoutAuction auction = new BuyoutAuction("Shirt", 10);

        Bid joeBid = new Bid("Joe", 8);
        Bid maryBid = new Bid("Mary", 10);
        Bid johnBid = new Bid("John", 20);
        auction.placeBid(joeBid);
        auction.buyNow(maryBid); // this is a buyout
        auction.placeBid(johnBid); // johns bid will not be accepted because the auction ended

        winnigBid = auction.getHighBid();
        System.out.println(winnigBid.getBidder() + " wins the " + auction.getItemForSale());
        System.out.println("For $" + winnigBid.getBidAmount());
        

        System.out.println();
        System.out.println();

        System.out.println("Starting a reserve auction");
        System.out.println("-----------------");
        
        
        ReserveAuction reserveAuction = new ReserveAuction("Shoes", 45);
        
        Bid bid = new Bid("Mary", 10);
        boolean wonBid = reserveAuction.placeBid(bid); // this bid is not accepted because it is below the reserve
        System.out.println("Did Mary win? " + wonBid);
        

    }
}
