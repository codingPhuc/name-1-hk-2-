   ![[Capture 7.png]]

Unix variant

Multitasking

User login -> invoke user’s choice of shell

§Shell executes fork() system call to create process

 •Executes exec() to load program into process

 •Shell waits for process to terminate or continues with user commands

§Process exits with:

 • code = 0 – no error

 • code > 0 – error code