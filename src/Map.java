public class Map {
    private String map= """
            ########################################
            #      ####                            #
            #      ####                            #
            #  X   ####        ##############      #
            #      ####        ##############      #
            #      ####        ###                 #
            #                  ###   X    ##########
            #                  ###        ##########
            ############       ###                 #
            ############       ################    #
            #                  ################    #
            #                        ###           #
            #        ####            ###     #     #
            #        ####            ###     #     #
            #        ####     X      ###     #  X  #
            #   @    ####            ###  S  #     #
            ########################################\s""";

    public String getMap() {
        return map;
    }

    public void setMap(String map) {
        this.map = map;
    }
}
