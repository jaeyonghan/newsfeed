CREATE TABLE IF NOT EXISTS user (
  member_no int(11) NOT NULL AUTO_INCREMENT COMMENT '회원번호',
  userid varchar(100) NOT NULL COMMENT '회원메일정보',
  nickname varchar(50)  NOT NULL COMMENT '별칭',
  PRIMARY KEY (member_no)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='회원정보';

CREATE TABLE IF NOT EXISTS follow (
  member_no int(11) NOT NULL COMMENT '회원번호',
  follow_member_no int(11) NOT NULL COMMENT '팔로우 유저 회원번호',
  reg_dt datetime NOT NULL DEFAULT NOW(),
  PRIMARY KEY (member_no)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='팔로우 유저 정보';

CREATE TABLE IF NOT EXISTS posting (
  post_no int(11) NOT NULL AUTO_INCREMENT COMMENT '포스트 번호',
  member_no int(11) NOT NULL COMMENT '회원번호',
  reg_dt datetime DEFAULT NULL COMMENT '등록일시',
  content text COMMENT '포스트 내용',
  content_type int(4) NOT NULL COMMENT '포스팅 타입 1: 텍스트  2: 이미지 3: 복합',
  PRIMARY KEY (post_no),
  INDEX POSTING_IK_1(member_no, post_no)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='포스트 테이블';