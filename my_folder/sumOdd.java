int sumOdd(int n) {
int s = 0;
int i = 1;
while (i <= n) {
	if (i % 2 == 1) {
		s += i;
	}
i++;
}
return s;
}