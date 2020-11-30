package io.zipcoder;

import com.sun.deploy.security.SelectableSecurityManager;

public class Music {

    private String[] playList;

    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {

        // count going forward!
        Integer endIndex = playList.length -1;
        Integer distanceGoingForward = Integer.MAX_VALUE;
        Integer distanceGoingBackward = 0;
        for (int i = 0; i < playList.length ; i++) {
            if (playList[i] == selection) {
               // distanceGoingForward = i - startIndex;
                if(i - startIndex < distanceGoingForward){
                    distanceGoingForward = i - startIndex;
                }
                distanceGoingBackward = endIndex - i + startIndex + 1;

            }

            // do another for loop maybe for 2nd test

        }
        System.out.println("Forward: " + distanceGoingForward);
        System.out.println("Backward: " + distanceGoingBackward);

        Integer fastestPath;

        if(distanceGoingForward < distanceGoingBackward){
            fastestPath = distanceGoingForward;
        } else {
            fastestPath = distanceGoingBackward;
        }

        return fastestPath;
    }
}


/**
 * {1,2,3,4,5,6,7,8,9,10}
 * endIndex = 9
 * startIndex = 1
 * songIndex = 7
 * i = 7-1 = 6
 * 9 - 7 + 1 = 3 +1 because need to find distance not index
 * start is 2 song is 8
 *
 */




//
//    private Integer whichIsQuicker(Integer distanceGoingBackWard, Integer distanceGoingForward) {
//       Integer answer = 0;
//        if(distanceGoingForward < distanceGoingBackWard){
//            answer = distanceGoingForward;}
//            else if (distanceGoingForward > distanceGoingBackWard) {
//            answer = distanceGoingBackWard;
//        }
//       // System.out.println(distanceGoingForward);
//            return answer;
//        }
//        }




// from start to song
    // from start to 0 index + end index to song
    //for loop
    // maybe find the index of selection loop till the end of that and go to the selection?
    // returning the index of that selection
    //TLDR just find index of selection.


    // DIStance from start index to selections aka button presses
    //length is 4 {0,1,2,3}
    // ending index is 4
    // is it closer to the end or start?
//    int count = 0;
//    // int selectionIndex = 0;
//    int distanceFromStart = 0;
//    int distanceFromEnd = 0;
//    int endIndex = playList.length - 1;
//        for (int i = startIndex; i < playList.length - 1; i++) {
//        if (playList[i] == selection) {
//        int selectionIndex = i;
//        System.out.println(selectionIndex);
//        }
//        }
////distance from song to end
//
////distance from start to song

//            for (int j = startIndex; j < selectionIndex; j++) {
//                if (playList[j] != selection) {
//                    distanceFromStart++;
//                    System.out.println(distanceFromStart + "-one1");
//                }
//            }
//
//            for (int k = selectionIndex; k < endIndex; k++) {
//                if (playList[k] != selection) {
//                    distanceFromEnd++;
//                }
//
//            }
//        System.out.println(distanceFromEnd + "end");
//        System.out.println(distanceFromStart + "start");
//        int winner = 0;
////    if(distanceFromStart < distanceFromEnd){
////        winner = distanceFromStart;
////    } else if (distanceFromStart > distanceFromEnd)
////       winner = distanceFromEnd;
//
//        System.out.println(winner);
//       // return count;
//        return distanceFromEnd;