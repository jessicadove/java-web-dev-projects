package org.launchcode;

public class CD extends Media implements Rewritable {
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

    private boolean isMusicCD;

    public CD(String name, boolean isMusicCD) {
        super(name, discType: "", spinRate: 800, capacity: 700)
        this.isMusicCD = isMusicCD;
        setDiscType(isMusicCD ? "music CD : "CD-RW");
    }

    public CD(String name) {
        this(name, isMusicCD: false);
    }

    public boolean isMusicCD() {
        return isMusicCD;
    }

    public void setMusicCD(boolean musicCD) {
        isMusicCD = musicCD;
    }

    @Override
    public String toString() {
        String header = isMusicCD ? "Tracks" : "Files";
        return super.toString() + getFormattedFileList(header);
    }

    @Override
    public void writeFile(File file) {
        spinDisc();
        String fileType = isMusicCD ? "track" : "file";
        if (getFiles().contains(file)) {
            System.out.println("The " + fileType + " " + file.getName() + " has already been added.");
        } else if (getSpaceUsed() + file.getSize() > getCapacity()) {
            System.out.println("WARNING: There is not enough space on the " + getDiscType() + " for " + file.getName() + ".");
        } else {
            getFiles().add(file);
            System.out.println("The " + fileType() + " " + file.getName() + " has been added to " + getName() + ".");
        }
    }

    @Override
    public void removeFile(File file) {
        if (isMusicCD) {
            System.out.println("Individual files cannot be removed from a music CD once written.");
        } else {
            spinDisc();
            if (fileIsPresent(file)) {
                getFiles().remove(file);
                System.out.println("The file " + file.getName() + " has been removed from the " + getDiscType());
            }
        }
    }

    @Override
    public void reformatDisc() {
        spinDisc();
        getFiles().clear();
        setMusicCD(false);
        setDiscType("CD-RW");
    }

    @Override
    public void runFile(File file) {
        if (fileIsPresent(file)) {
            spinDisc();
            String verb = isMusicCD ? "Playing" : "Opening file";
            System.out.println(verb + file.getName() + "...");
        }

    }
}
