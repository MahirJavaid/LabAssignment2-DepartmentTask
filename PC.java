public class PC {
    private String assetID;
    private String name;
    private String LCDName;
    private int RAMSizeMB;
    private int DiskSizeGB;
    private boolean gpu;


    public PC( String assetID, String name, String LCDName, int RAMSizeMB, int DiskSizeGB, boolean gpu ){
        this.assetID = assetID;
        this.name = name;
        this.LCDName = LCDName;
        this.RAMSizeMB = RAMSizeMB;
        this.DiskSizeGB = DiskSizeGB;
        this.gpu = gpu;
    }

    public void setAssetID(String assetID) {
        this.assetID = assetID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLCDName(String LCDName) {
        this.LCDName = LCDName;
    }

    public void setRAMSizeMB(int RAMSizeMB) {
        this.RAMSizeMB = RAMSizeMB;
    }

    public void setDiskSizeGB(int diskSizeGB) {
        DiskSizeGB = diskSizeGB;
    }

    public void setGpu(boolean gpu) {
        this.gpu = gpu;
    }

    public String getAssetID() {
        return assetID;
    }

    public String getName() {
        return name;
    }

    public String getLCDName() {
        return LCDName;
    }

    public int getRAMSizeMB() {
        return RAMSizeMB;
    }

    public int getDiskSizeGB() {
        return DiskSizeGB;
    }

    public boolean isGpu() {
        return gpu;
    }

    @Override
    public String toString(){
        return "AssetID :"+assetID +" Name :"+name +" Name of LCD :"+LCDName +" RAM Size(MB) :"+RAMSizeMB +" Disk Size(GB) :"+DiskSizeGB +" Graphic Card :"+gpu;
    }

    public PC( PC pc ){
        this.assetID = pc.assetID;
        this.name = pc.name;
        this.LCDName = pc.LCDName;
        this.RAMSizeMB = pc.RAMSizeMB;
        this.DiskSizeGB = pc.DiskSizeGB;
        this.gpu = pc.gpu;
    }

    @Override
    public Object clone(){
        return new PC(this);
    }

    @Override
    public boolean equals( Object other ){
        PC temp = (PC) other;
        return this.assetID.equals(temp.assetID);
    }
}
