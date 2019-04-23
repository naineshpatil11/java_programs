package com.bridgelabz.objectoriented.commercialdataprocessing;

public class commercialCompanyProj
{
	private String stockName;
	private String stockSymbol;
	private String noOFShare;
	private String sharePrise;
	
	public commercialCompanyProj()
	{
		
	}
	
	public commercialCompanyProj(String stockName, String symbol, String noOFShare, String sharePrise)
	{
		super();
		this.stockName = stockName;
		this.stockSymbol = stockSymbol;
		this.noOFShare = noOFShare;
		this.sharePrise = sharePrise;
	}
	
	public String getStockName() {
		return stockName;
	}
	public void setStockName(String stockName) {
		this.stockName = stockName;
	}
	public String getstockSymbol() {
		return stockSymbol;
	}
	public void setstockSymbol(String symbol) {
		this.stockSymbol = symbol;
	}
	public String getNoOFShare() {
		return noOFShare;
	}
	public void setNoOFShare(String noOFShare) {
		this.noOFShare = noOFShare;
	}
	public String getSharePrise() {
		return sharePrise;
	}
	public void setSharePrise(String sharePrise) {
		this.sharePrise = sharePrise;
	}	
}
