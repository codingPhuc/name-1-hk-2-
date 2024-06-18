# cấu trúc hệ thống máy tính 

hệ thống máy tính 
1 [[phần cứng]]
cung cấp tài nguyên phục vụ cho các chương trình , nhưng ứng dụng chạy và giải quyết công việt cho ng dùng 
vd : bộ xử lý trung tâm , thiết bị đầu vào , mạch chủ ,RAM ... 

2 [[hdh]] :
chương trình trung gian giữa người dùng và máy tính giúp quản lý phần cứng để cung cấp tài nguyên giúp ứng dụng giải quyết vấn đề cho ng dùng 

3 [[trương trình ứng dụng]] :
sử dụng tài nguyên phần cứng thực thi một số nhiệm vụ thao tác tạo nên một số trức năng cho ng dùng 
vd : ct soạn thảo văn bản sử dụng máy in hay màn hình dể giúp tạo văn bản cho ng dùng , hay trò chơi game 

4 [[ng sử dụng]] :
- ng sử dụng máy tính phục vụ nhu cầu hay hoàn thành công việt
- có thể là máy tính khác như trong các  hệ thống nhúng không phải con người mà máy tính cơ khí  trao đổi với nhau 
![[Capture.png]]
4 thành phần liên lạc với nhau : 
ng dùng sử dụng [[trương trình ứng dụng]] -> [[trương trình ứng dụng]] gọi đến [[hdh]]->[[hdh]] gọi đến [[phần cứng]] xong trả lại kết quả cho người dùng => quá trình diễn ra liên tục lập lai cho kỳ 
trong máy tính [[hdh]] không can hiệp vào quá trình chạy ,mà khi có sự kiện vấn đề xảy ra thì [[hdh]] sẽ giải quyết vấn đề đó trước khi chạy lại chương trình 
