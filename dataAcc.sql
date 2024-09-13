SELECT TOP (1000) [name_account_trade]
      ,[createday]
      ,[image]
      ,[image1]
      ,[image2]
      ,[image3]
      ,[password]
      ,[price]
      ,[status]
  FROM [HFG].[dbo].[list_account_trade]

  insert into list_account_trade (name_account_trade,createday,image,image1,image2,image3,password,price,status) values 
	('ac001','29/07/2024','ima001.png','ima001-1.png','ima001-2.png','ima001-3.png','123','200','sale'),
	('ac002','29/07/2024','ima001.png','ima001-1.png','ima001-2.png','ima001-3.png','123','300','sale'),
	('ac003','29/07/2024','ima001.png','ima001-1.png','ima001-2.png','ima001-3.png','123','400','sale'),
	('ac004','29/07/2024','ima001.png','ima001-1.png','ima001-2.png','ima001-3.png','123','100','sale'),
	('ac005','29/07/2024','ima001.png','ima001-1.png','ima001-2.png','ima001-3.png','123','200','sale'),
	('ac006','29/07/2024','ima001.png','ima001-1.png','ima001-2.png','ima001-3.png','123','400','sale'),
	('ac007','29/07/2024','ima001.png','ima001-1.png','ima001-2.png','ima001-3.png','123','500','sale'),
	('ac008','29/07/2024','ima001.png','ima001-1.png','ima001-2.png','ima001-3.png','123','500','sale'),
  