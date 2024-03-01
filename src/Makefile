jj = javac

all: install

install:
	mkdir -p build
	javac ToDoList.java && mv ToDoList.class build
    
uninstall:
	rm -rf build
    
dist: install
	tar -cf ToDoList.tar.gz build/
	rm -rf build
    
extract:
	tar -xvf ToDoList.tar.gz

clean:
	rm -rf build ToDoList.tar.gz

do_style:
	clang-format -style=Google -i *java 

check_style:
	clang-format -style=Google -n *java h
