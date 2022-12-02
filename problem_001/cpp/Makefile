CXX=g++
CXXFLAGS=-Wall -pedantic -O2

all: main main.o solution.o

main: main.o solution.o
	$(CXX) $(CXXFLAGS) $^ -o $@

main.o: main.cpp solution.hpp
solution.o: solution.cpp solution.hpp

clean:
	$(RM) *.o main
