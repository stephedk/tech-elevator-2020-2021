package com.techelevator.auctions.controller;
import com.techelevator.auctions.DAO.AuctionDAO;
import com.techelevator.auctions.DAO.MemoryAuctionDAO;
import com.techelevator.auctions.model.Auction;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/auctions")

public class AuctionController {
    private AuctionDAO dao;
    public AuctionController() {
        this.dao = new MemoryAuctionDAO();
    }
    
    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<Auction> list(@RequestParam(required = false) String title_like,
    						 @RequestParam(defaultValue = "0") Double currentBid_lte) {
    	if(title_like != null && currentBid_lte > 0) {
    		
    		return dao.searchByTitleAndPrice(title_like, currentBid_lte); 
    	}
    	else if (title_like != null)
    	{
    		return dao.searchByTitle(title_like); 
    	}
    
    	else if (currentBid_lte > 0)
    	{
    		return dao.searchByPrice(currentBid_lte); 
    	}
    
    	else
    	{
    		return dao.list(); 
    	}
    }
    
    
    
    
    @RequestMapping(path = "/{currentBid}", method = RequestMethod.GET)
    public Auction get(@PathVariable int currentBid) {
    	
    	
    	return dao.get(currentBid);
    	
    	
    }
    
    @RequestMapping(path = "",  method = RequestMethod.POST)
    public Auction listAnAuction(@RequestBody Auction auction) {
        return dao.create(auction);
    	
    	
    }
    
//    @RequestMapping(path = "", method = RequestMethod.GET)
//    public List<Auction> list(@RequestParam(required = false) String title_like){
//    	
//    	if(title_like == null) {
//    		
//    		return dao.list(); 
//    	}
//    	else
//    	{
//    		return dao.searchByTitle(title_like); 
//    	}
//    }
    
    
//    
//    @RequestMapping(path = "/{title_like}", method = RequestMethod.GET)
//    
//    List<Auction> title(@RequestParam (value = "title_like", defaultValue = "") String title_like){
    	
//    	List<Auction> titleSearch = dao.searchByTitle(title_like); 
//    	
//    	return titleSearch; 
//    	return dao.searchByTitle(title_like); 
//    }

}
    
    
    


