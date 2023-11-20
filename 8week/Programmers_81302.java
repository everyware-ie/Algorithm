public class Programmers_81302 {
    int[] dx = {-1,0,1,0};
    int[] dy = {0,1,0,-1};
    public int[] solution(String[][] places) {
        int[] answer = new int[places.length];
        for(int i=0; i<places.length; i++){
            answer[i] = convertToChar(places[i]);
        }
        return answer;
    }

    public int convertToChar(String[] place){
        char[][] p = new char[5][5];
        for(int i=0; i<5; i++){
            p[i] = place[i].toCharArray();
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                if(p[i][j] == 'P') {
                    if(DFS(i,j, p)==0) return 0;
                }
            }
        }
        return 1;
    }

    public int DFS(int x, int y, char[][] places){
        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<5 && ny>=0 && ny<5) {
                if (places[nx][ny] == 'P') return 0;
                if (places[nx][ny]=='O'){
                    if (check(nx, ny, places, x, y) == 0) return 0;

                }
            }
        }
        return 1;
    }

    public int check(int x, int y, char[][] places, int curX, int curY){
        for(int i=0; i<4; i++){
            int nx = x+dx[i];
            int ny = y+dy[i];
            if(nx>=0 && nx<5 && ny>=0 && ny<5 && places[nx][ny]=='P' && (nx != curX || ny != curY)) {
                if (Math.abs(nx - curX) + Math.abs(ny - curY) <= 2) {
                    return 0;
                }
            }
        }
        return 1;
    }
}
