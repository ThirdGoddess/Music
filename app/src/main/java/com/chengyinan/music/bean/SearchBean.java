package com.chengyinan.music.bean;

import java.util.List;

/**
 * @author ThirdGoddess
 * @email ofmyhub@gmail.com
 * @Github https://github.com/ThirdGoddess
 * @date :2020-02-19 18:58
 */
public class SearchBean {
    /**
     * result : {"queryCorrected":["金桥姑娘"],"songs":[{"id":1405225333,"name":"桥边姑娘","artists":[{"id":33182132,"name":"Mangoleidi","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},{"id":0,"name":"桥边姑娘","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}],"album":{"id":83492431,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1574309124539,"size":1,"copyrightId":0,"status":0,"picId":109951164501267780,"mark":0},"duration":159500,"copyrightId":0,"status":0,"alias":[],"rtype":0,"ftype":0,"mvid":0,"fee":8,"rUrl":null,"mark":64},{"id":1408364353,"name":"桥边姑娘","artists":[{"id":33610372,"name":"无果","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}],"album":{"id":83944901,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1575740012033,"size":2,"copyrightId":0,"status":0,"picId":109951164535709420,"mark":0},"duration":253000,"copyrightId":0,"status":0,"alias":[],"rtype":0,"ftype":0,"mvid":0,"fee":8,"rUrl":null,"mark":64},{"id":1408596731,"name":"桥边姑娘","artists":[{"id":12280365,"name":"张三","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}],"album":{"id":83989120,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1575820800000,"size":0,"copyrightId":754021,"status":0,"picId":109951164538946370,"mark":0},"duration":284337,"copyrightId":754021,"status":0,"alias":[],"rtype":0,"ftype":0,"mvid":0,"fee":8,"rUrl":null,"mark":0},{"id":1418292141,"name":"桥边姑娘","artists":[{"id":4092,"name":"刘小天","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}],"album":{"id":85087384,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1579622400000,"size":1,"copyrightId":0,"status":0,"picId":109951164645214720,"mark":0},"duration":189884,"copyrightId":0,"status":0,"alias":[],"rtype":0,"ftype":0,"mvid":0,"fee":8,"rUrl":null,"mark":0}],"songCount":134}
     * code : 200
     */

    private ResultBean result;
    private int code;

    public ResultBean getResult() {
        return result;
    }

    public void setResult(ResultBean result) {
        this.result = result;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public static class ResultBean {
        /**
         * queryCorrected : ["金桥姑娘"]
         * songs : [{"id":1405225333,"name":"桥边姑娘","artists":[{"id":33182132,"name":"Mangoleidi","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},{"id":0,"name":"桥边姑娘","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}],"album":{"id":83492431,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1574309124539,"size":1,"copyrightId":0,"status":0,"picId":109951164501267780,"mark":0},"duration":159500,"copyrightId":0,"status":0,"alias":[],"rtype":0,"ftype":0,"mvid":0,"fee":8,"rUrl":null,"mark":64},{"id":1408364353,"name":"桥边姑娘","artists":[{"id":33610372,"name":"无果","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}],"album":{"id":83944901,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1575740012033,"size":2,"copyrightId":0,"status":0,"picId":109951164535709420,"mark":0},"duration":253000,"copyrightId":0,"status":0,"alias":[],"rtype":0,"ftype":0,"mvid":0,"fee":8,"rUrl":null,"mark":64},{"id":1408596731,"name":"桥边姑娘","artists":[{"id":12280365,"name":"张三","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}],"album":{"id":83989120,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1575820800000,"size":0,"copyrightId":754021,"status":0,"picId":109951164538946370,"mark":0},"duration":284337,"copyrightId":754021,"status":0,"alias":[],"rtype":0,"ftype":0,"mvid":0,"fee":8,"rUrl":null,"mark":0},{"id":1418292141,"name":"桥边姑娘","artists":[{"id":4092,"name":"刘小天","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}],"album":{"id":85087384,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1579622400000,"size":1,"copyrightId":0,"status":0,"picId":109951164645214720,"mark":0},"duration":189884,"copyrightId":0,"status":0,"alias":[],"rtype":0,"ftype":0,"mvid":0,"fee":8,"rUrl":null,"mark":0}]
         * songCount : 134
         */

        private int songCount;
        private List<String> queryCorrected;
        private List<SongsBean> songs;

        public int getSongCount() {
            return songCount;
        }

        public void setSongCount(int songCount) {
            this.songCount = songCount;
        }

        public List<String> getQueryCorrected() {
            return queryCorrected;
        }

        public void setQueryCorrected(List<String> queryCorrected) {
            this.queryCorrected = queryCorrected;
        }

        public List<SongsBean> getSongs() {
            return songs;
        }

        public void setSongs(List<SongsBean> songs) {
            this.songs = songs;
        }

        public static class SongsBean {
            /**
             * id : 1405225333
             * name : 桥边姑娘
             * artists : [{"id":33182132,"name":"Mangoleidi","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},{"id":0,"name":"桥边姑娘","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}]
             * album : {"id":83492431,"name":"桥边姑娘","artist":{"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null},"publishTime":1574309124539,"size":1,"copyrightId":0,"status":0,"picId":109951164501267780,"mark":0}
             * duration : 159500
             * copyrightId : 0
             * status : 0
             * alias : []
             * rtype : 0
             * ftype : 0
             * mvid : 0
             * fee : 8
             * rUrl : null
             * mark : 64
             */

            private int id;
            private String name;
            private AlbumBean album;
            private int duration;
            private int copyrightId;
            private int status;
            private int rtype;
            private int ftype;
            private int mvid;
            private int fee;
            private Object rUrl;
            private List<ArtistsBean> artists;
            private List<?> alias;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public AlbumBean getAlbum() {
                return album;
            }

            public void setAlbum(AlbumBean album) {
                this.album = album;
            }

            public int getDuration() {
                return duration;
            }

            public void setDuration(int duration) {
                this.duration = duration;
            }

            public int getCopyrightId() {
                return copyrightId;
            }

            public void setCopyrightId(int copyrightId) {
                this.copyrightId = copyrightId;
            }

            public int getStatus() {
                return status;
            }

            public void setStatus(int status) {
                this.status = status;
            }

            public int getRtype() {
                return rtype;
            }

            public void setRtype(int rtype) {
                this.rtype = rtype;
            }

            public int getFtype() {
                return ftype;
            }

            public void setFtype(int ftype) {
                this.ftype = ftype;
            }

            public int getMvid() {
                return mvid;
            }

            public void setMvid(int mvid) {
                this.mvid = mvid;
            }

            public int getFee() {
                return fee;
            }

            public void setFee(int fee) {
                this.fee = fee;
            }

            public Object getRUrl() {
                return rUrl;
            }

            public void setRUrl(Object rUrl) {
                this.rUrl = rUrl;
            }

            public List<ArtistsBean> getArtists() {
                return artists;
            }

            public void setArtists(List<ArtistsBean> artists) {
                this.artists = artists;
            }

            public List<?> getAlias() {
                return alias;
            }

            public void setAlias(List<?> alias) {
                this.alias = alias;
            }

            public static class AlbumBean {
                /**
                 * id : 83492431
                 * name : 桥边姑娘
                 * artist : {"id":0,"name":"","picUrl":null,"alias":[],"albumSize":0,"picId":0,"img1v1Url":"https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg","img1v1":0,"trans":null}
                 * publishTime : 1574309124539
                 * size : 1
                 * copyrightId : 0
                 * status : 0
                 * picId : 109951164501267780
                 * mark : 0
                 */

                private int id;
                private String name;
                private ArtistBean artist;
                private long publishTime;
                private int size;
                private int copyrightId;
                private int status;
                private long picId;
                private int mark;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public ArtistBean getArtist() {
                    return artist;
                }

                public void setArtist(ArtistBean artist) {
                    this.artist = artist;
                }

                public long getPublishTime() {
                    return publishTime;
                }

                public void setPublishTime(long publishTime) {
                    this.publishTime = publishTime;
                }

                public int getSize() {
                    return size;
                }

                public void setSize(int size) {
                    this.size = size;
                }

                public int getCopyrightId() {
                    return copyrightId;
                }

                public void setCopyrightId(int copyrightId) {
                    this.copyrightId = copyrightId;
                }

                public int getStatus() {
                    return status;
                }

                public void setStatus(int status) {
                    this.status = status;
                }

                public long getPicId() {
                    return picId;
                }

                public void setPicId(long picId) {
                    this.picId = picId;
                }

                public int getMark() {
                    return mark;
                }

                public void setMark(int mark) {
                    this.mark = mark;
                }

                public static class ArtistBean {
                    /**
                     * id : 0
                     * name :
                     * picUrl : null
                     * alias : []
                     * albumSize : 0
                     * picId : 0
                     * img1v1Url : https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
                     * img1v1 : 0
                     * trans : null
                     */

                    private int id;
                    private String name;
                    private Object picUrl;
                    private int albumSize;
                    private int picId;
                    private String img1v1Url;
                    private int img1v1;
                    private Object trans;
                    private List<?> alias;

                    public int getId() {
                        return id;
                    }

                    public void setId(int id) {
                        this.id = id;
                    }

                    public String getName() {
                        return name;
                    }

                    public void setName(String name) {
                        this.name = name;
                    }

                    public Object getPicUrl() {
                        return picUrl;
                    }

                    public void setPicUrl(Object picUrl) {
                        this.picUrl = picUrl;
                    }

                    public int getAlbumSize() {
                        return albumSize;
                    }

                    public void setAlbumSize(int albumSize) {
                        this.albumSize = albumSize;
                    }

                    public int getPicId() {
                        return picId;
                    }

                    public void setPicId(int picId) {
                        this.picId = picId;
                    }

                    public String getImg1v1Url() {
                        return img1v1Url;
                    }

                    public void setImg1v1Url(String img1v1Url) {
                        this.img1v1Url = img1v1Url;
                    }

                    public int getImg1v1() {
                        return img1v1;
                    }

                    public void setImg1v1(int img1v1) {
                        this.img1v1 = img1v1;
                    }

                    public Object getTrans() {
                        return trans;
                    }

                    public void setTrans(Object trans) {
                        this.trans = trans;
                    }

                    public List<?> getAlias() {
                        return alias;
                    }

                    public void setAlias(List<?> alias) {
                        this.alias = alias;
                    }
                }
            }

            public static class ArtistsBean {
                /**
                 * id : 33182132
                 * name : Mangoleidi
                 * picUrl : null
                 * alias : []
                 * albumSize : 0
                 * picId : 0
                 * img1v1Url : https://p1.music.126.net/6y-UleORITEDbvrOLV0Q8A==/5639395138885805.jpg
                 * img1v1 : 0
                 * trans : null
                 */

                private int id;
                private String name;
                private Object picUrl;
                private int albumSize;
                private int picId;
                private String img1v1Url;
                private int img1v1;
                private Object trans;
                private List<?> alias;

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public String getName() {
                    return name;
                }

                public void setName(String name) {
                    this.name = name;
                }

                public Object getPicUrl() {
                    return picUrl;
                }

                public void setPicUrl(Object picUrl) {
                    this.picUrl = picUrl;
                }

                public int getAlbumSize() {
                    return albumSize;
                }

                public void setAlbumSize(int albumSize) {
                    this.albumSize = albumSize;
                }

                public int getPicId() {
                    return picId;
                }

                public void setPicId(int picId) {
                    this.picId = picId;
                }

                public String getImg1v1Url() {
                    return img1v1Url;
                }

                public void setImg1v1Url(String img1v1Url) {
                    this.img1v1Url = img1v1Url;
                }

                public int getImg1v1() {
                    return img1v1;
                }

                public void setImg1v1(int img1v1) {
                    this.img1v1 = img1v1;
                }

                public Object getTrans() {
                    return trans;
                }

                public void setTrans(Object trans) {
                    this.trans = trans;
                }

                public List<?> getAlias() {
                    return alias;
                }

                public void setAlias(List<?> alias) {
                    this.alias = alias;
                }
            }
        }
    }
}
