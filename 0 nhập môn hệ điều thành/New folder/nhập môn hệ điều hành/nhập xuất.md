hai phuông pháp dk [[nhập xuất]]
- nhập xuất khi mà nhập xuất bắt đầu tức là các thiết bị ngoại vi bắt đầu thao tác với máy tính thì chương trình của người dùng sẽ phải chờ cho đến khi nào chương trình nhập xuất hoàn tất rồi mới thực thi 
- khi thiết bị nhập xuất thực hiện hay vì chờ thì nó sẽ dc thực thi luân phiên với chương trình người dùng
-> nhập xuất có thể chờ hoặc đồng thời thực hiện 
1. nhập xuất chờ:
- áp dụng cho chương trình cần công việt nhập câu lệnh hoàn thành , hoàn thành khi có tính hiệu [[ngắt]] báo về 
- sẽ chờ bằng một vòng loop lặp ở  chương trình người dùng 
- điều này sẽ tốn thời gian và tài nguyên của chương trình 
2. không chờ nhập xuất :
- chương trình có thể giao điều khiển cho chương trình người dùng mà không cần phải chờ nhập xuất hoàn thiện 
- sẽ có cái bản chứa thông tin hoàn thiện nhiệm vụ của từng thiết bị 
- [[hdh]] sẽ giựa vào cái bản đó để coi tình trạng và coi khi nào dùng [[ngắt]] báo hệ thống
