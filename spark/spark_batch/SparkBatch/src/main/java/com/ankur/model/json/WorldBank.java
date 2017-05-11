package com.ankur.model.json;

import java.util.List;

import com.ankur.model.common.CustomModelClass;

public class WorldBank extends CustomModelClass {

	private WorldBankId _id;
	private String approvalfy;
	private String board_approval_month;
	private String boardapprovaldate;
	private String borrower;
	private String closingdate;
	private String country_namecode;
	private String countrycode;
	private String countryname;
	private String countryshortname;
	private String docty;
	private String envassesmentcategorycode;
	private long grantamt;
	private long ibrdcommamt;
	private String id;
	private long idacommamt;
	private String impagency;
	private String lendinginstr;
	private String lendinginstrtype;
	private long lendprojectcost;
	private List<WorldBankMajorSector> majorsector_percent;
	private List<WorldBankMajorSectorNameCode> mjsector_namecode;
	private List<String> mjtheme;
	private List<WorldBankMajorSectorNameCode> mjtheme_namecode;
	private String mjthemecode;
	private String prodline;
	private String prodlinetext;
	private String productlinetype;
	private ProjectAbstract project_abstract;
	private String project_name;
	private List<WorldBankProjectDocs> projectdocs;
	private String projectfinancialtype;
	private String projectstatusdisplay;
	private String regionname;
	private List<WorldBankSectorInfo> sector;
	private WorldBankSectorInfo sector1;
	private WorldBankSectorInfo sector2;
	private WorldBankSectorInfo sector3;
	private List<WorldBankMajorSectorNameCode> sector_namecode;
	private String sectorcode;
	private String source;
	private String status;
	private String supplementprojectflg;
	private WorldBankSectorInfo theme1;
	private List<WorldBankMajorSectorNameCode> theme_namecode;
	private String themecode;
	private long totalamt;
	private long totalcommamt;
	private String url;

	public WorldBankId get_id() {
		return _id;
	}

	public void set_id(WorldBankId _id) {
		this._id = _id;
	}

	public String getApprovalfy() {
		return approvalfy;
	}

	public void setApprovalfy(String approvalfy) {
		this.approvalfy = approvalfy;
	}

	public String getBoard_approval_month() {
		return board_approval_month;
	}

	public void setBoard_approval_month(String board_approval_month) {
		this.board_approval_month = board_approval_month;
	}

	public String getBoardapprovaldate() {
		return boardapprovaldate;
	}

	public void setBoardapprovaldate(String boardapprovaldate) {
		this.boardapprovaldate = boardapprovaldate;
	}

	public String getBorrower() {
		return borrower;
	}

	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}

	public String getClosingdate() {
		return closingdate;
	}

	public void setClosingdate(String closingdate) {
		this.closingdate = closingdate;
	}

	public String getCountry_namecode() {
		return country_namecode;
	}

	public void setCountry_namecode(String country_namecode) {
		this.country_namecode = country_namecode;
	}

	public String getCountrycode() {
		return countrycode;
	}

	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}

	public String getCountryname() {
		return countryname;
	}

	public void setCountryname(String countryname) {
		this.countryname = countryname;
	}

	public String getCountryshortname() {
		return countryshortname;
	}

	public void setCountryshortname(String countryshortname) {
		this.countryshortname = countryshortname;
	}

	public String getDocty() {
		return docty;
	}

	public void setDocty(String docty) {
		this.docty = docty;
	}

	public String getEnvassesmentcategorycode() {
		return envassesmentcategorycode;
	}

	public void setEnvassesmentcategorycode(String envassesmentcategorycode) {
		this.envassesmentcategorycode = envassesmentcategorycode;
	}

	public long getGrantamt() {
		return grantamt;
	}

	public void setGrantamt(long grantamt) {
		this.grantamt = grantamt;
	}

	public long getIbrdcommamt() {
		return ibrdcommamt;
	}

	public void setIbrdcommamt(long ibrdcommamt) {
		this.ibrdcommamt = ibrdcommamt;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public long getIdacommamt() {
		return idacommamt;
	}

	public void setIdacommamt(long idacommamt) {
		this.idacommamt = idacommamt;
	}

	public String getImpagency() {
		return impagency;
	}

	public void setImpagency(String impagency) {
		this.impagency = impagency;
	}

	public String getLendinginstr() {
		return lendinginstr;
	}

	public void setLendinginstr(String lendinginstr) {
		this.lendinginstr = lendinginstr;
	}

	public String getLendinginstrtype() {
		return lendinginstrtype;
	}

	public void setLendinginstrtype(String lendinginstrtype) {
		this.lendinginstrtype = lendinginstrtype;
	}

	public long getLendprojectcost() {
		return lendprojectcost;
	}

	public void setLendprojectcost(long lendprojectcost) {
		this.lendprojectcost = lendprojectcost;
	}

	public List<WorldBankMajorSector> getMajorsector_percent() {
		return majorsector_percent;
	}

	public void setMajorsector_percent(List<WorldBankMajorSector> majorsector_percent) {
		this.majorsector_percent = majorsector_percent;
	}

	public List<WorldBankMajorSectorNameCode> getMjsector_namecode() {
		return mjsector_namecode;
	}

	public void setMjsector_namecode(List<WorldBankMajorSectorNameCode> mjsector_namecode) {
		this.mjsector_namecode = mjsector_namecode;
	}

	public List<String> getMjtheme() {
		return mjtheme;
	}

	public void setMjtheme(List<String> mjtheme) {
		this.mjtheme = mjtheme;
	}

	public List<WorldBankMajorSectorNameCode> getMjtheme_namecode() {
		return mjtheme_namecode;
	}

	public void setMjtheme_namecode(List<WorldBankMajorSectorNameCode> mjtheme_namecode) {
		this.mjtheme_namecode = mjtheme_namecode;
	}

	public String getMjthemecode() {
		return mjthemecode;
	}

	public void setMjthemecode(String mjthemecode) {
		this.mjthemecode = mjthemecode;
	}

	public String getProdline() {
		return prodline;
	}

	public void setProdline(String prodline) {
		this.prodline = prodline;
	}

	public String getProdlinetext() {
		return prodlinetext;
	}

	public void setProdlinetext(String prodlinetext) {
		this.prodlinetext = prodlinetext;
	}

	public String getProductlinetype() {
		return productlinetype;
	}

	public void setProductlinetype(String productlinetype) {
		this.productlinetype = productlinetype;
	}

	public ProjectAbstract getProject_abstract() {
		return project_abstract;
	}

	public void setProject_abstract(ProjectAbstract project_abstract) {
		this.project_abstract = project_abstract;
	}

	public String getProject_name() {
		return project_name;
	}

	public void setProject_name(String project_name) {
		this.project_name = project_name;
	}

	public List<WorldBankProjectDocs> getProjectdocs() {
		return projectdocs;
	}

	public void setProjectdocs(List<WorldBankProjectDocs> projectdocs) {
		this.projectdocs = projectdocs;
	}

	public String getProjectfinancialtype() {
		return projectfinancialtype;
	}

	public void setProjectfinancialtype(String projectfinancialtype) {
		this.projectfinancialtype = projectfinancialtype;
	}

	public String getProjectstatusdisplay() {
		return projectstatusdisplay;
	}

	public void setProjectstatusdisplay(String projectstatusdisplay) {
		this.projectstatusdisplay = projectstatusdisplay;
	}

	public String getRegionname() {
		return regionname;
	}

	public void setRegionname(String regionname) {
		this.regionname = regionname;
	}

	public List<WorldBankSectorInfo> getSector() {
		return sector;
	}

	public void setSector(List<WorldBankSectorInfo> sector) {
		this.sector = sector;
	}

	public WorldBankSectorInfo getSector1() {
		return sector1;
	}

	public void setSector1(WorldBankSectorInfo sector1) {
		this.sector1 = sector1;
	}

	public WorldBankSectorInfo getSector2() {
		return sector2;
	}

	public void setSector2(WorldBankSectorInfo sector2) {
		this.sector2 = sector2;
	}

	public WorldBankSectorInfo getSector3() {
		return sector3;
	}

	public void setSector3(WorldBankSectorInfo sector3) {
		this.sector3 = sector3;
	}

	public List<WorldBankMajorSectorNameCode> getSector_namecode() {
		return sector_namecode;
	}

	public void setSector_namecode(List<WorldBankMajorSectorNameCode> sector_namecode) {
		this.sector_namecode = sector_namecode;
	}

	public String getSectorcode() {
		return sectorcode;
	}

	public void setSectorcode(String sectorcode) {
		this.sectorcode = sectorcode;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSupplementprojectflg() {
		return supplementprojectflg;
	}

	public void setSupplementprojectflg(String supplementprojectflg) {
		this.supplementprojectflg = supplementprojectflg;
	}

	public WorldBankSectorInfo getTheme1() {
		return theme1;
	}

	public void setTheme1(WorldBankSectorInfo theme1) {
		this.theme1 = theme1;
	}

	public List<WorldBankMajorSectorNameCode> getTheme_namecode() {
		return theme_namecode;
	}

	public void setTheme_namecode(List<WorldBankMajorSectorNameCode> theme_namecode) {
		this.theme_namecode = theme_namecode;
	}

	public String getThemecode() {
		return themecode;
	}

	public void setThemecode(String themecode) {
		this.themecode = themecode;
	}

	public long getTotalamt() {
		return totalamt;
	}

	public void setTotalamt(long totalamt) {
		this.totalamt = totalamt;
	}

	public long getTotalcommamt() {
		return totalcommamt;
	}

	public void setTotalcommamt(long totalcommamt) {
		this.totalcommamt = totalcommamt;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

}
