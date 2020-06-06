insert into skill(label, description) values('javascript', 'Javascript language skill');
insert into skill(label, description) values('ruby', 'Ruby language skill');
insert into skill(label, description) values('emberjs', 'Emberjs framework');
insert into skill(label, description) values('angularjs', 'Angularjs framework');

insert into developer(first_name, last_name, email) values('Neil', 'Llique', 'neil.llique@gmail.com');
insert into developer(first_name, last_name, email) values('Eloy', 'Santillán', 'eloy.santillan@gmail.com');
insert into developer(first_name, last_name, email) values('Larry', 'Valderrama', 'larry@gmail.com');

insert into developer_skills(developer_id, skills_id)  values(1,1);
insert into developer_skills(developer_id, skills_id)  values(2,2);
insert into developer_skills(developer_id, skills_id)  values(3,4);