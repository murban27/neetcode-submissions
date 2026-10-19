class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Character>[] rows = new HashSet[9];
        HashSet<Character>[] cols = new HashSet[9];
        HashSet<Character>[] boxes = new HashSet[9];
        for(int i=0;i<board.length;i++) {

            for(int k=0;k< board[i].length;k++)
            {
                if(board[i][k]=='.')
                {
                    continue;
                }
                int todo = (i / 3) * 3 + (k / 3);

                if(rows[i]==null)
                {
                    rows[i]=new HashSet<>();
                }
                if(cols[k]==null)
                {
                    cols[k]=new HashSet<>();
                }
                if(boxes[todo]==null)
                {
                    boxes[todo]=new HashSet<>();
                }
                if(rows[i].contains(board[i][k])||cols[k].contains(board[i][k])||boxes[todo].contains(board[i][k]))
                {
                 return false;
                }
                else{
                    rows[i].add(board[i][k]);
                    cols[k].add(board[i][k]);
                    boxes[todo].add(board[i][k]);
                }

            }
        }
        return true;
    }
}
