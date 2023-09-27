package org.launchcode;

import java.io.File;

public class Main {
    public static void main(String[] args) {

        // TODO: Declare and initialize a CD and a DVD object.

        CD noNeedToArgue = new CD(name: "No Need to Argue", isMusicDC: true);
        CD graphicDesignProjects = new CD(name: "Graphic Design Projects");
        DVD friendsSeason1 = new DVD(name: "Friends Season One");

        // TODO: Call each CD and DVD method to verify that they work as expected.

        File zombie = new File(name: "Zombie", size: 50);
        File odeToMyFamily = new File(name: "Ode to My Family", size: 61);
        File iCantBeWithYou = new File(name: "I Can't Be With You", size: 57);
        noNeedToArgue.writeFile(zombie);
        noNeedToArgue.writeFile(odeToMyFamily);
        noNeedToArgue.writeFile(iCantBeWithYou);

        File festivalPoster = new File(name: "festival-poster.psd", size: 240);
        File businessCard = new File(name: "business-card.ai", size: 52);
        graphicDesignProjects.writeFile(festivalPoster);
        graphicDesignProjects.writeFile(businessCard);

        File szn1ep1 = new File(name: "The One Where Monica Gets a Roommate", size: 420);
        File szn1ep2 = new File(name: "The One with the Sonogram", size: 420);
        File szn1ep3 = new File(name: "The One with the Thumb", size: 420);
        friendsSeason1.writeFile(szn1ep1);
        friendsSeason1.writeFile(szn1ep2);
        friendsSeason1.writeFile(szn1ep3);

        // Print each CD and DVD object
        System.out.println(noNeedToArgue);
        System.out.println(graphicDesignProjects);
        System.out.println(friendsSeason1);

        // runFile() on each CD file type
        noNeedToArgue.runFile(zombie);
        graphicDesignProjects.runFile(festivalPoster);

        // Try to write a file to DVD that has already been written
        friendsSeason1.writeFile(szn1ep1);

        // Use eraseData() to remove a file from CD object, then try to run the file
        graphicDesignProjects.removeFile(festivalPoster);
        graphicDesignProjects.runFile(festivalPoster);

        // Use reformatDisc() to wipe all files, then try to run a file
        noNeedToArgue.reformatDisc();
        noNeedToArgue.runFile(zombie);

        // Create a large file and try to write it to CD that is no longer music CD
        File tooBigFile = new File(name: "too-big-file.mp4", size: 720);
        noNeedToArgue.writeFile(tooBigFile);

    }
}