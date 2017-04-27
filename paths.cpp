#include <iostream>
using namespace std;

int main(){
	int paths[4][4];
	for (int i=0;i<4;i++) {
		for(int j=0;j<4;j++) {
			paths[i][j] = 0;
		}
	}
	
	for (int i=0; i<4; i++){
			for(int j=0; j<4;j++){
				if (i == 0 && j == 0) {
					paths[i][j] = 1;
				} else if (i == 0) {
					paths[i][j] = paths[i][j-1];
				} else if (j == 0){
					paths[i][j] = paths[i-1][j];
				} else if (i == 3 && j== 3) {
					paths[i][j] = 1 + paths[i - 1][j] + paths[i][j-1];
				} else if ( i == 3) {
					paths[i][j] = 1 + paths[i-1][j] + paths[i][j-1];
				} else {
					paths[i][j] = paths[i-1][j] + paths[i+1][j]+ paths[i][j+1]+ paths[i][j-1];
				}
			}
		}


		
		cout<<"No of unique paths: "<<paths[3][3];

	return 0;
}