# linker and loaders
https://www.youtube.com/watch?v=cJDRShqtTbk
- khi biên dịch một chương trình thì ta sẽ có dc một tập tin tái định vị 
- khi chạy một chương trình biến số chuyển thành một địa chỉ trong bộ nhớ , ta không biết giá trị cụ thể và địa chỉ của nó đến khi kết thúc chương trình ->  tái định vị là tái định vị ở đây có nghĩa là thay đổi địa chỉ Bộ nhớ  sau mỗi lần sạc
1. linkers hay liên kết sẽ liên kết file thư viện và file đối tượng hay file mình viết trên c hay c++ vào nhau tạo ra tập tin chạy dc 
2. khi biên dịch xong thì sẽ dc lưu vào ổ cứng 
3. loader sẽ nạp  chương trình vào bộ nhớ chính khi dc gọi sau đó [[hdh]] tìm ra vùng nhớ  ,thêm vào địa chỉ cho chương trình và cho các biến 
khi chạy thì thường không nạp vào cả chương trình 
mà chỉ gọi chương trình con hoặc thư viện khi cần thiết ,giúp giảm dung lượng .Ở window thì đặt ở  bộ thư viện liên kết động DLLS 
các file đối tượng dc thực hiện chỉ trện 1 [[hdh]] không thể trên 1 [[hdh]] khác 
