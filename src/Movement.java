public class Movement {
    private Map map;

    public Movement(Map map){
        this.map=map;
    }

    public void left(){
        int index=map.getMap().indexOf("@");
        if (map.getMap().charAt(index-1)!='#'&&map.getMap().charAt(index-1)==' '){
            map.setMap(map.getMap().substring(0,index-1)+"@"+map.getMap().substring(index,map.getMap().length()));
            map.setMap(map.getMap().substring(0,index)+" "+map.getMap().substring(index+1,map.getMap().length()));
        }else if (map.getMap().charAt(index-1)=='X'){
            //enemy
            System.out.println("enemy");
        }else if (map.getMap().charAt(index-1)=='S'){
            //Schatz
            System.out.println("Found the treasure");
        }
    }

    public void right(){
        int index=map.getMap().indexOf("@");
        if (map.getMap().charAt(index+1)!='#'&&map.getMap().charAt(index+1)==' '){
            map.setMap(map.getMap().substring(0,index)+" "+map.getMap().substring(index+1,map.getMap().length()));
            map.setMap(map.getMap().substring(0,index+1)+"@"+map.getMap().substring(index+2,map.getMap().length()));
        }else if (map.getMap().charAt(index+1)=='X'){
            //enemy
            System.out.println("enemy");
        }else if (map.getMap().charAt(index+1)=='S'){
            //Schatz
            System.out.println("Found the treasure");
        }
    }

    public void up() {
        int index = map.getMap().indexOf("@");
        if (map.getMap().charAt(index - 41) != '#'&&map.getMap().charAt(index-41)==' ') {
            map.setMap(map.getMap().substring(0, index - 41) + "@" + map.getMap().substring(index - 40));
            map.setMap(map.getMap().substring(0, index) + " " + map.getMap().substring(index + 1));
        }else if (map.getMap().charAt(index-41)=='X'){
            //enemy
            System.out.println("enemy");
        }else if (map.getMap().charAt(index-41)=='S'){
            //Schatz
            System.out.println("Found the treasure");
        }
    }

    public void down(){
        int index=map.getMap().indexOf("@");
        if (map.getMap().charAt(index+41)!='#'&&map.getMap().charAt(index+41)==' '){
            map.setMap(map.getMap().substring(0,index)+" "+map.getMap().substring(index+1,map.getMap().length()));
            map.setMap(map.getMap().substring(0,index+41)+"@"+map.getMap().substring(index+42,map.getMap().length()));
        }else if (map.getMap().charAt(index+41)=='X'){
            //enemy
            System.out.println("enemy");
        }else if (map.getMap().charAt(index+41)=='S'){
            //Schatz
            System.out.println("Found the treasure");
        }
    }

}
