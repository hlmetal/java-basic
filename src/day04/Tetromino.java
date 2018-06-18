package day04;
//�ĸ�ƴ��
public class Tetromino {
	Cell[] cells;//��������
	Tetromino(){
		cells =new Cell[4];//����Cell�������
	}
	void drop() {
		for(int i=0;i<cells.length;i++) {
			cells[i].row++;
		}
	}
	void moveLeft() {
		for(int i=0;i<cells.length;i++) {
			cells[i].col--;
		}
	}
	void moveRight() {
		for(int i=0;i<cells.length;i++) {
			cells[i].col++;
		}
	}
	void print() {
		for(int i=0;i<cells.length;i++) {
			System.out.println(cells[i].getCellInfo());
		}
	}
	
}