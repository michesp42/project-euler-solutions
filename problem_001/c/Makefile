CC=gcc
CFLAGS=-Wall -pedantic -O2

all: main main.o solution.o

main: main.o solution.o
	$(CC) $(CFLAGS) $^ -o $@

main.o: main.c solution.h
solution.o: solution.c solution.h

clean:
	$(RM) *.o main
