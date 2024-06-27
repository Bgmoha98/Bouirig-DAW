
DROP TABLE "ALUMNES";


CREATE TABLE "ALUMNES" (
  "DNI" VARCHAR2(10), 
  "NOM" VARCHAR2(50), 
  "COGNOMS" VARCHAR2(50), 
  "EDAT" NUMBER(2,0), 
  "DOMICILI" VARCHAR2(255), 
  "CP" VARCHAR2(10), 
  "POBLACIO" VARCHAR2(100), 
  "PROVINCIA" VARCHAR2(50), 
  "CURS" NUMBER(1,0), 
  "NIVELL" VARCHAR2(10), 
  "CLASSE" VARCHAR2(10), 
  "FALTES1T" NUMBER(3,0), 
  "FALTES2T" NUMBER(3,0), 
  "FALTES3T" NUMBER(3,0), 
  "DATA_MATRICULA" DATE,
  CONSTRAINT PK_ALUMNES PRIMARY KEY (DNI)
);
  

Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('31594951E','Sasha','Davis','14','Apartado num.: 699, 9977 Tempus, Avenida','1151','Las Vegas','Nevada','3','BATX','D','5','9','42',to_date('01/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('47849124N','Amber','Sanders','15','3353 Elementum Avda.','979820','Assen','Drenthe','4','BATX','D','43','48','14',to_date('02/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('19515365B','Shaine','Kemp','18','4471 Eget, Avda.','5315','Ceyhan','Adana','3','CICLES','D','13','17','10',to_date('03/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('38172719N','Inez','Allen','24','Apdo.:170-7605 Molestie Ctra.','9928RS','Cartagena','Murcia','4','BATX','B','46','17','24',to_date('04/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('24978072O','Illana','Stephens','25','Apartado num.: 612, 707 Sed Calle','8603','Vienna','Vienna','4','BATX','C','3','32','42',to_date('05/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('64509485Y','Fatima','Chandler','23','285-824 Sed C.','02575','Rotorua','North Island','1','CICLES','C','2','18','4',to_date('06/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('79444737P','Sade','Hester','14','927-6689 Amet, Calle','J8 3RL','Flint','Michigan','1','CICLES','B','28','26','10',to_date('07/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('78288461Y','Paula','Shannon','23',null,'34188','Cartagena','Murcia','2','BATX','A','33','15','11',to_date('08/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('90184603Z','Latifah','Carlson','24','Apdo.:238-3818 Blandit C.','A4Y 5V2','Bendigo','Victoria','2','CICLES','D','6','46','12',to_date('09/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('44760539F','Desiree','Powers','21','858-2939 Ipsum Carretera','6955','Cariboo Regional District','British Columbia','1','BATX','A','21','31','10',to_date('10/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('70047953V','Kylie','Lara','14','Apdo.:960-4454 Metus Av.','V9K 1G3','Mercedes','Heredia','4','BATX','A','6','32','44',to_date('11/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('41383475G','Knox','Fletcher','16','149-9457 Ullamcorper, Avda.','8815PT','CriciÃºma','Santa Catarina','3','BATX','C','7','11','6',to_date('12/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('62913799V','Amery','Harper','19','Apartado num.: 390, 2706 Ligula. C.','5837','Chastre','Waals-Brabant','2','ESO','D','20','23','34',to_date('13/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('67295458S','Stuart','Franklin','20','Apartado num.: 504, 6254 Sed Ctra.','864452','Cork','Munster','3','BATX','C','44','16','8',to_date('14/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('41972348F','Jin','Meadows','17','Apdo.:292-5417 Pretium Carretera','5792','Feilding','North Island','3','ESO','D','38','20','8',to_date('15/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('70315636T','Martina','Maynard','13','6338 Aliquet Avenida','75593','RibeirÃ£o das Neves','Minas Gerais','2','BATX','C','25','2','18',to_date('16/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('71487117C','Clare','Simon','12','395-8938 Magna, Ctra.','24179','Coreglia Antelminelli','Toscana','3','CICLES','C','12','29','47',to_date('17/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('39458653B','Faith','Bates','16','Apdo.:748-4049 Tellus. Avda.','43760','Gisborne','North Island','3','CICLES','D','33','7','1',to_date('18/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('00760757T','Slade','Whitehead','25','Apartado num.: 101, 9624 Mauris Ctra.','V7N 3Z5','CrÃ©teil','ÃŽle-de-France','4','CICLES','D','37','15','1',to_date('19/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('72111188K','Savannah','Mathews','13','Apartado num.: 196, 9250 Eget C/','1998','Kalgoorlie-Boulder','Western Australia','3','ESO','B','24','16','7',to_date('20/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('56338257C','Madeson','Paul','24','5660 Id, Avenida','4250','Cork','Munster','4','BATX','A','8','12','38',to_date('21/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('69927573X','Hedy','Boone','18','Apartado num.: 332, 1891 Placerat Av.','15013','Baltasound','Shetland','1','CICLES','D','42','34','20',to_date('22/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('91143564I','Denton','Thompson','18','Apartado num.: 212, 672 Nullam Avda.','63545','San JosÃ© de Alajuela','Alajuela','1','CICLES','C','35','46','19',to_date('23/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('22817297N','Emmanuel','Lara','24','Apdo.:577-6720 Hendrerit Avenida','TA4P 7KG','Bloomington','Minnesota','1','BATX','D','11','48','32',to_date('01/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('49265323K','Mariam','Lyons','13','Apdo.:715-4148 Dui, C.','55857','Purmerend','Noord Holland','1','ESO','C','12','46','13',to_date('02/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('04604930D','Nadine','Duncan','16','Apdo.:671-4856 Laoreet ','26486','Racine','Wisconsin','3','CICLES','A','46','47','16',to_date('03/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('85896645Z','May','Cash','23','Apdo.:809-4228 Elementum, ','N4N 5C6','Bremerhaven','Bremen','4','ESO','C','26','4','16',to_date('04/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('02338652H','Jamal','Graham','23',null,'30593','Guadalajara','Castilla - La Mancha','3','BATX','C','8','31','28',to_date('05/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('60875061K','Avram','Reilly','22','Apartado num.: 945, 5238 In Carretera','T3V 6L4','Ranchi','Jharkhand','1','ESO','D','49','2','12',to_date('06/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('83434961L','Clayton','Mack','13','Apartado num.: 955, 9606 Gravida ','66656-493','Kaneohe','Hawaii','2','ESO','B','27','42','13',to_date('07/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('18490877O','Joel','Best','13','1235 A ','77359','Grand Rapids','Michigan','1','ESO','B','39','41','43',to_date('08/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('83824943W','Rebekah','Livingston','19','160-5920 Tempor, Carretera','71305','Siddi','Sardegna','2','BATX','D','15','10','32',to_date('09/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('72947146P','Jonas','Boyd','14','3990 Fringilla C/','54060-339','Galway','Connacht','2','BATX','A','8','29','13',to_date('10/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('58512951B','Mark','Ware','16','Apartado num.: 421, 2628 Pretium C/','2289','Porto Cesareo','Puglia','1','CICLES','D','41','23','27',to_date('11/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('39761701S','Marsden','Bolton','24','549-7920 Parturient Avenida','31433','Dos Hermanas','AndalucÃ­a','1','CICLES','D','25','13','42',to_date('12/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('56476884Y','Audrey','Harper','16','9521 Ipsum. C/','5116TP','Galway','Connacht','4','ESO','B','50','23','19',to_date('13/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('32092818C','Henry','Terry','24','Apartado num.: 344, 7088 Ultricies Calle','6078','CaÃ±as','Guanacaste','3','CICLES','B','10','32','37',to_date('14/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('86447522X','Alden','Dickson','12','870-8362 Venenatis Ctra.','25746','Porirua','North Island','2','BATX','D','2','6','44',to_date('15/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('84016134D','Dustin','Bradford','25','397-7548 Feugiat Avda.','74748','Riï¿½zes','Henegouwen','3','BATX','A','39','29','6',to_date('16/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('89076803I','Nathan','Francis','22','104-6090 Leo. C/','30311','Cartagena','Murcia','2','BATX','C','0','0','0',to_date('17/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('84846711C','Madeline','Dodson','19','Apartado num.: 174, 7000 Facilisi. Calle','7879','Vienna','Vienna','3','CICLES','D','37','9','31',to_date('18/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('93710518V','Judah','Cardenas','23','2442 Dictum Carretera','9692','Hathras','Uttar Pradesh','1','CICLES','B','48','8','45',to_date('19/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('15263486E','Zachery','Haney','15','345 Nibh Avenida','V6M 6R9','PiÅ‚a','Wielkopolskie','2','CICLES','C','30','11','18',to_date('20/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('16713215T','Wallace','Mcgee','25','Apartado num.: 633, 1787 Interdum. ','E7T 1IH','Queanbeyan','New South Wales','2','ESO','A','10','46','18',to_date('21/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('18174186E','Noel','Manning','18','Apartado num.: 859, 1108 Iaculis Avenida','50044','St. Albans','Hertfordshire','2','CICLES','B','40','2','14',to_date('22/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('19919593D','Deirdre','Foley','21','Apdo.:422-357 Orci C.','23-059','Vidisha','Madhya Pradesh','1','ESO','B','50','19','47',to_date('01/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('64461702I','Kiayada','Clayton','20','Apartado num.: 268, 2272 Vivamus Av.','6546','Dublin','Leinster','3','CICLES','A','42','28','24',to_date('02/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('51029771X','Ulysses','Allison','25','941-6618 Vivamus C.','03676','Damoh','Madhya Pradesh','3','ESO','C','38','19','1',to_date('03/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('87304304L','Sydnee','Moore','21','9110 Amet Carretera','31214','Segni','Lazio','3','CICLES','D','47','25','4',to_date('04/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('18465433P','Hannah','Wiggins','12','839-3811 Suspendisse ','2786WL','Coevorden','Drenthe','2','CICLES','B','29','37','31',to_date('05/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('98511100R','Mechelle','Rivers','22','1445 Nec Av.','5095','Berlin','Berlin','3','ESO','B','44','44','11',to_date('06/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('78243644A','Dustin','Dawson','15','279-5217 Pellentesque, Av.','445291','Istanbul','Istanbul','3','BATX','A','5','10','9',to_date('07/06/2019','DD/MM/YYYY'));
Insert into ALUMNES (DNI,NOM,COGNOMS,EDAT,DOMICILI,CP,POBLACIO,PROVINCIA,CURS,NIVELL,CLASSE,FALTES1T,FALTES2T,FALTES3T,DATA_MATRICULA) values ('93493341B','Jaime','Douglas','12','611-5565 Ut ','KE9 4FF','Berlin','Berlin','4','BATX','C','8','31','17',to_date('08/06/2019','DD/MM/YYYY'));

COMMIT;