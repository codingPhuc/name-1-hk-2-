# system services
dịch vụ dc cung cấp thông qua các trương trình hệ thống thay vì các api như trong [[lời gọi (system calls)]]với các dịch vụ như sau : 
•File manipulation
•Status information sometimes stored in a file
•Programming language suppor
•Program loading and execution
•Communications
•Background services
•Application programs
tạo ra môt môi trường thuận tiện cho việt phát triển và hoạt động của trương trình 
*một số chỉ là giao diện giúp cho người dùng sử dụng [[lời gọi (system calls)]],số khác thì phức tạp hơn 
   

#File_management - Create, delete, copy, rename, print, dump, list, and generally manipulate files and directories

#Status_information

•Some ask the system for info - date, time, amount of available memory, disk space, number of users

•Others provide detailed performance, logging, and debugging information

•Typically, these programs format and print the output to the terminal or other output devices

•Some systems implement a registry - used to store and retrieve configuration information
   

#File_modification

•Text editors to create and modify files

•Special commands to search contents of files or perform transformations of the text

#Programming-language_support - Compilers, assemblers, debuggers and interpreters sometimes provided

Program loading and execution- Absolute loaders, relocatable loaders, linkage editors, and overlay-loaders, debugging systems for higher-level and machine language

#Communications - Provide the mechanism for creating virtual connections among processes, users, and computer systems

•Allow users to send messages to one another’s screens, browse web pages, send electronic-mail messages, log in remotely, transfer files from one machine to another

   

#Background_Services

•Launch at boot time

- Some for system startup, then terminate

 - Some from system boot to shutdown

•Provide facilities like disk checking, process scheduling, error logging, printing

•Run in user context not kernel context

•Known as services, subsystems, daemons

#Application_programs

•Don’t pertain to system

•Run by users

•Not typically considered part of OS

•Launched by command line, mouse click, finger poke
 