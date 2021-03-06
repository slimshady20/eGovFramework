package com.jayden.web.proxies;


import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Data
@Component
public class Pager {
	@Autowired UserProxy manager;
   private int rowCount,rowStart,rowEnd,
        pageCount,pageSize,pageStart,pageEnd,nowPage,
    blockCount,blockSize,prevBlock, nextBlock, nowBlock;
   private boolean existPrev, existNext;
   private String searchWord;
   public void paging(){
       rowCount = 0;
       rowStart = nowPage * pageSize ; // 0
       rowEnd = (nowPage != (pageCount -1)) ? rowStart + ( pageSize-1): rowCount-1; // 4 0부터 시작하니 pagecount -1 해서 하나씩 낮춰줘야함 nowPage가 index
       pageCount = (rowCount % pageSize != 0) ? rowCount / pageSize+1 : rowCount / pageSize; // 10
     //  pageSize =5;
       pageStart = nowBlock * blockSize;
       pageEnd = (nowBlock != blockCount -1)? pageStart + ( blockSize - 1 ) : pageCount-1;
    //   nowPage = 1;
       blockCount = (pageCount % blockSize) != 0 ? pageCount / blockSize +1 : pageCount / blockSize;
    //   blockSize = 5;
       prevBlock = pageStart - blockSize;
       nextBlock = pageStart + blockSize;
       nowBlock= nowPage / blockSize;
       existPrev= nowBlock != 0 ;
       System.out.println("existPrev:: " + existPrev);
       existNext = (nowBlock+1) != blockCount;
       System.out.println("existNext::" + existNext);
   }

}
