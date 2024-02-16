create database TITV_ProjectDB

create table tacgia(
	maTacGia varchar(255) not null primary key,
	hoVaTen varchar(255) not null,
	ngaySinh date,
	tieuSu text
)

create table theloai(
	maTheLoai varchar(255) not null primary key,
	tenTheLoai varchar(255),
)

create table sach(
	maSach varchar(255) not null primary key,
	tenSach varchar(255) not null,
	maTacGia varchar(255) not null, 
	namXuatBan int,
	giaNhap float,
	giaBan float,
	giaGoc float,
	soLuong int not null,
	maTheLoai varchar(255) not null,
	ngonNgu varchar(255),
	moTa text,
	foreign key(maTacGia) references tacgia(maTacGia),
	foreign key(maTheLoai) references theloai(maTheLoai)
)

create table khachhang(
	maKhachHang varchar(255) not null primary key,
	tenDangNhap varchar(255) not null,
	matKhau varchar(512) not null,
	hoVaTen varchar(255) not null,
	gioiTinh varchar(20) not null,
	diaChi varchar(512) not null,
	diaChiNhanHang varchar(512) not null,
	diaChiMuaHang varchar(512) not null,
	ngaySinh date not null,
	soDienThoai varchar(50) not null,
	email varchar(120) not null,
	dangKyNhanBangTin tinyint,
)

create table donhang(
	maDonHang varchar(255) not null primary key,
	maKhachHang varchar(255) not null,
	diaChiNguoiMua varchar(512) not null,
	diaChiNhanHang varchar(512) not null,
	diaChiMuaHang varchar(512) not null,
	trangThai varchar(255) not null,
	hinhThucThanhThoan varchar(255) not null,
	soTienDaThanhToan float,
	soTienConThieu float,
	ngayDatHang date not null,
	ngayGiaHang date not null,
	foreign key(maKhachHang) references khachhang(maKhachHang)
)

create table chitietdonhang(
	maChiTietDonHang varchar(255) not null primary key,
	maDonHang varchar(255) not null,
	maSach varchar(255) not null,
	soLuong int,
	giaBia float,
	giaGiam float,
	giaBan float,
	vat float,
	tongTien float,
	foreign key(maDonHang) references donhang(maDonHang),
	foreign key(maSach) references sach(maSach)
)